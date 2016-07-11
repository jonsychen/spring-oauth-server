package com.api.gateway.service;

import java.util.List;

import com.api.gateway.domain.dto.OauthClientDetailsDto;
import com.api.gateway.domain.oauth.OauthClientDetails;

/**
 * @author Jonsy
 */

public interface OauthService {

    OauthClientDetails loadOauthClientDetails(String clientId);

    List<OauthClientDetailsDto> loadAllOauthClientDetailsDtos();

    void archiveOauthClientDetails(String clientId);

    OauthClientDetailsDto loadOauthClientDetailsDto(String clientId);

    void registerClientDetails(OauthClientDetailsDto formDto);
}