package com.example.cicd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TextUtilsTest {

    @Test
    void safeParseInt_validNumber_returnsValue() {
        assertEquals(42, TextUtils.safeParseInt("42"));
    }

    @Test
    void safeParseInt_invalidNumber_returnsZero() {
        assertEquals(0, TextUtils.safeParseInt("x"));
    }

	@Test
	void safeParseInt_negativeNumber_returnsValue() {
		assertEquals(-64, TextUtils.safeParseInt("-64"));
	}

    @Test
    void isPalindrome_caseInsensitive_expectedTrue() {
        assertTrue(TextUtils.isPalindrome("Anna"));
    }
}
