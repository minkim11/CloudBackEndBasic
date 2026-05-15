package com.example.cloudbackendbasic.common.aop;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@Aspect
@RequiredArgsConstructor
public class ApiRequestInfoLoggingAop {

    private final HttpServletRequest request;

    @Before("execution(* com.example.cloudbackendbasic.controller.*.*(..))")
    public void logApiRequest() {

        log.info("[API - LOG] {} {}", request.getMethod(), request.getRequestURI());
    }
}
