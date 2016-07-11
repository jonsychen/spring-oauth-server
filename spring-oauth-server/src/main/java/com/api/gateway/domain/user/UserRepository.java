package com.api.gateway.domain.user;

import java.util.List;

import com.api.gateway.domain.shared.Repository;

/**
 * @author Jonsy
 */

public interface UserRepository extends Repository {

    User findByGuid(String guid);

    void saveUser(User user);

    void updateUser(User user);

    User findByUsername(String username);

    List<User> findUsersByUsername(String username);
}