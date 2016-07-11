package com.api.test.util;

import org.testng.annotations.Test;

import com.api.gateway.util.PasswordHandler;

import static org.testng.Assert.*;

/*
  * @author Shengzhao Li
  */
public class PasswordHandlerTest {


    @Test
    public void testMd5() throws Exception {

        final String md5 = PasswordHandler.md5("123456");
        assertNotNull(md5);
        System.out.println(md5);
    }
}