package com.api.test.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.api.test.ContextTest;

/**
 * @author Shengzhao Li
 */
public abstract class AbstractRepositoryTest extends ContextTest {


    @Autowired
    private JdbcTemplate jdbcTemplate;


    public JdbcTemplate jdbcTemplate() {
        return jdbcTemplate;
    }


}