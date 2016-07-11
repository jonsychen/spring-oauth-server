package com.api.test.util;

import org.testng.annotations.Test;

import com.api.gateway.util.DateUtils;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

/*
  * @author Jonsy
  */
public class DateUtilsTest {


    @Test
    public void convert() {

        LocalDateTime localDateTime = LocalDateTime.of(2015, 4, 3, 12, 30, 22);

        final LocalDate localDate = localDateTime.toLocalDate();
        System.out.println(localDate);

        final Timestamp timestamp = Timestamp.valueOf(localDateTime);
        assertNotNull(timestamp);
        System.out.println(timestamp);


        final String text = DateUtils.toDateTime(localDateTime);
        assertEquals(text,"2015-04-03 12:30:22");

    }

}