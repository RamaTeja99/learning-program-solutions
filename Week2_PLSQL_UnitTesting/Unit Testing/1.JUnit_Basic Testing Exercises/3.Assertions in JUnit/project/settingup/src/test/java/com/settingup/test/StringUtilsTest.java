package com.settingup.test;

import org.junit.Test;
import com.settingup.StringUtils;
import static org.junit.Assert.*;
public class StringUtilsTest {

    private final StringUtils utils = new StringUtils();

    @Test
    public void testIsPalindrome() {
        assertTrue(utils.isPalindrome("Madam"));
        assertFalse(utils.isPalindrome("Java"));
        assertFalse(utils.isPalindrome(null));
    }

    @Test
    public void testToUpper() {
        assertEquals("HELLO", utils.toUpper("hello"));
        assertNull(utils.toUpper(null));
    }
}