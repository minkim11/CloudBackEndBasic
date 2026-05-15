package com.example.cloudbackendbasic.controller;

import com.example.cloudbackendbasic.dto.CreateMemberRequest;
import com.example.cloudbackendbasic.dto.ReadMemberResponse;
import com.example.cloudbackendbasic.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/members")
public class MemberController {

    private final MemberService memberService;

    @PostMapping
    public ResponseEntity<Void> createMember(@RequestBody CreateMemberRequest request) {
        memberService.save(request);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ReadMemberResponse> readMember(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(memberService.getMember(id));
    }
}
