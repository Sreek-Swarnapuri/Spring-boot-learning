package com.sreek.Springbootlearning.filters;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.MDC;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.util.UUID;

@Component
public class MDCFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        try {
            String userId = UUID.randomUUID().toString();
            String correlationID = UUID.randomUUID().toString();
            MDC.put("UserId", userId);
            MDC.put("CorrelationID", correlationID);
            filterChain.doFilter(request, response);
        } finally {
            MDC.clear();
        }
    }
}
