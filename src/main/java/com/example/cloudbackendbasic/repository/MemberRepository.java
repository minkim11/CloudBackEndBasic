package com.example.cloudbackendbasic.repository;

import com.example.cloudbackendbasic.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
