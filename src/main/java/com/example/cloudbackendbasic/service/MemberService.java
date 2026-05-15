package com.example.cloudbackendbasic.service;

import com.example.cloudbackendbasic.dto.CreateMemberRequest;
import com.example.cloudbackendbasic.dto.ReadMemberResponse;
import com.example.cloudbackendbasic.entity.Member;
import com.example.cloudbackendbasic.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public void save(CreateMemberRequest request) {

        Member member = new Member(request.getName(), request.getAge(), request.getMbti());

        memberRepository.save(member);
    }

    public ReadMemberResponse getMember(Long id) {

        Member member = memberRepository.findById(id).orElseThrow(
                () -> new IllegalStateException("없는 팀원")
        );

        return new ReadMemberResponse(member.getName(), member.getAge(), member.getMbti());

    }
}
