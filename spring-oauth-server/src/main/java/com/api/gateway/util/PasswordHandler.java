package com.api.gateway.util;

import org.springframework.security.authentication.encoding.Md5PasswordEncoder;

/**
 *
 * @author Jonsy
 */
public abstract class PasswordHandler {


    private PasswordHandler() {
    }


    public static String md5(String password) {
        Md5PasswordEncoder encoder = new Md5PasswordEncoder();
        return encoder.encodePassword(password, null);
    }
}
