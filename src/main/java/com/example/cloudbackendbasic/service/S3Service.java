package com.example.cloudbackendbasic.service;

import com.example.cloudbackendbasic.entity.Member;
import com.example.cloudbackendbasic.repository.MemberRepository;
import io.awspring.cloud.s3.S3Template;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class S3Service {

    private static final Duration PRESIGNED_URL_EXPIRATION = Duration.ofDays(7);

    private final S3Template s3Template;
    private final MemberRepository memberRepository;

    @Value("${spring.cloud.aws.s3.bucket}")
    private String bucket;

    @Transactional
    public String upload(MultipartFile file, Long id) {
        // 팀원 조회
        Member member = memberRepository.findById(id).orElseThrow(
                () -> new IllegalStateException("없는 팀원")
        );

        // 프로필 key S3에 업로드 후 DB에 key 저장
        try {
            String key = "uploads/" + UUID.randomUUID() + "_" + file.getOriginalFilename();
            s3Template.upload(bucket, key, file.getInputStream());
            member.uploadProfile(key);
            return key;
        } catch (IOException e) {
            throw new RuntimeException("파일 업로드 실패", e);
        }
    }

    @Transactional(readOnly = true)
    public URL getDownloadUrl(Long id) {

        Member member = memberRepository.findById(id).orElseThrow(
                () -> new IllegalStateException("없는 팀원")
        );

        return s3Template.createSignedGetURL(bucket, member.getProfileKey(), PRESIGNED_URL_EXPIRATION);
    }
}
