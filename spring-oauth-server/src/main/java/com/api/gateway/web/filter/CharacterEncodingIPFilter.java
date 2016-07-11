package com.api.gateway.web.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.filter.CharacterEncodingFilter;

import com.api.gateway.web.WebUtils;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Jonsy
 */
public class CharacterEncodingIPFilter extends CharacterEncodingFilter {

    private static final Logger LOG = LoggerFactory.getLogger(CharacterEncodingIPFilter.class);


    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        recordIP(request);
        super.doFilterInternal(request, response, filterChain); 
    }

    private void recordIP(HttpServletRequest request) {
        final String ip = WebUtils.retrieveClientIp(request);
        WebUtils.setIp(ip);
        LOG.debug("Send request uri: {}, from IP: {}", request.getRequestURI(), ip);
    }
}
