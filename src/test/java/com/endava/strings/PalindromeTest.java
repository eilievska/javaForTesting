package com.endava.strings;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PalindromeTest {

    private Palindrome palindrome = new Palindrome();

    @Test
    public void isPalindromeCheck() {
        assertTrue(palindrome.isPalindromeCheck("Anna"));
        assertTrue(palindrome.isPalindromeCheck("anna"));
        assertTrue(palindrome.isPalindromeCheck("ana"));
        assertTrue(palindrome.isPalindromeCheck("ANA"));
        assertTrue(palindrome.isPalindromeCheck("aNa"));
        assertTrue(palindrome.isPalindromeCheck("Kayak"));
        assertTrue(palindrome.isPalindromeCheck("A"));
        assertFalse(palindrome.isPalindromeCheck(""));
        assertFalse(palindrome.isPalindromeCheck("Endava"));
        assertFalse(palindrome.isPalindromeCheck("endava"));
        assertFalse(palindrome.isPalindromeCheck("ENDAVA"));
        assertFalse(palindrome.isPalindromeCheck("END"));
        assertFalse(palindrome.isPalindromeCheck("END"));
    }
}