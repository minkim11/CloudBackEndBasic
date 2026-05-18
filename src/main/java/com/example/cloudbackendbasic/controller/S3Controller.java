package com.example.cloudbackendbasic.controller;

import com.example.cloudbackendbasic.dto.FileDownloadResponse;
import com.example.cloudbackendbasic.dto.FileUploadResponse;
import com.example.cloudbackendbasic.service.S3Service;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.net.URL;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/members/{id}/profile-image")
public class S3Controller {

    private final S3Service s3Service;

    @PostMapping
    public ResponseEntity<FileUploadResponse> upload(
            @PathVariable Long id,
            @RequestParam("file") MultipartFile file) {
        String key = s3Service.upload(file, id);
        return ResponseEntity.ok(new FileUploadResponse(key));
    }

    @GetMapping
    public ResponseEntity<FileDownloadResponse> getDownloadUrl(@PathVariable Long id) {
        URL url = s3Service.getDownloadUrl(id);
        return ResponseEntity.ok(new FileDownloadResponse(url.toString()));
    }
}
