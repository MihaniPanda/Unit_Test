package com.example.unittest;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void testIsEmailValid(){
        String testEmail = "asgdgfhjjkk@mail.ru";
        Assert.assertThat(String.format("Email  невалидный %s ", testEmail),
                Utilitis.chekEmailForValidity(testEmail), is(true));
    }
}