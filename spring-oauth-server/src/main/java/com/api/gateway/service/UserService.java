package com.api.gateway.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.api.gateway.domain.dto.UserFormDto;
import com.api.gateway.domain.dto.UserJsonDto;
import com.api.gateway.domain.dto.UserOverviewDto;

/**
 * @author Jonsy
 */
public interface UserService extends UserDetailsService {

    UserJsonDto loadCurrentUserJsonDto();

    UserOverviewDto loadUserOverviewDto(UserOverviewDto overviewDto);

    boolean isExistedUsername(String username);

    String saveUser(UserFormDto formDto);
}