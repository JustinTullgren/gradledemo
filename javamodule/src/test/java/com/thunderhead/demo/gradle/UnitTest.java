package com.thunderhead.demo.gradle;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class UnitTest {

    private String subject;
    @Before
    public void setup() {
        subject = "Foo Bar";
    }

    @Test
    public void testToUpperCase() {
        assertTrue(subject.toUpperCase().equals("FOO BAR"));
    }
}
