package com.api.gateway.domain.oauth;

import java.util.List;

import com.api.gateway.domain.shared.Repository;

/**
 * @author Jonsy
 */
public interface OauthRepository extends Repository {

    OauthClientDetails findOauthClientDetails(String clientId);

    List<OauthClientDetails> findAllOauthClientDetails();

    void updateOauthClientDetailsArchive(String clientId, boolean archive);

    void saveOauthClientDetails(OauthClientDetails clientDetails);
}