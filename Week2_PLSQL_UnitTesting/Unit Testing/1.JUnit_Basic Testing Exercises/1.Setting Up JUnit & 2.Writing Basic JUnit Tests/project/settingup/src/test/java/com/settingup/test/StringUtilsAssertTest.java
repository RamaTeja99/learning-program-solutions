package com.settingup.test;

import org.junit.Test;

import com.settingup.StringUtilsAssert;

import static org.junit.Assert.*;

public class StringUtilsAssertTest {

    private final StringUtilsAssert utils = new StringUtilsAssert();

    @Test
    public void testIsPalindrome() {
        assertTrue(utils.isPalindrome("Madam"));
        assertFalse(utils.isPalindrome("Hello"));
        assertFalse(utils.isPalindrome(null));
    }

    @Test
    public void testReverse() {
        assertEquals("olleH", utils.reverse("Hello"));
        assertEquals("", utils.reverse(""));
        assertNull(utils.reverse(null));
    }

    @Test
    public void testCountVowels() {
        assertEquals(5, utils.countVowels("Education"));
        assertEquals(0, utils.countVowels("Rhythm"));
        assertEquals(0, utils.countVowels(null));
    }
}
