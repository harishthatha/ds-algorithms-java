package com.dsalgo.logics;

import org.junit.Before;
import org.junit.jupiter.api.*;

import java.util.Set;
import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Testing Strings Palindromes behaviour")
class PalindromeTest {

    private static Palindrome PALINDROME = new Palindrome();

    /**
     * @throws java.lang.Exception
     */
    @AfterAll
    static void tearDownAfterClass() throws Exception {
    }

    @Before
    void setUpObjects() throws Exception {
        //PALINDROME = new Palindrome();
    }

    /**
     * @throws java.lang.Exception
     */
    @BeforeEach
    void setUp() throws Exception {
    }

    /**
     * @throws java.lang.Exception
     */
    @AfterEach
    void tearDown() throws Exception {
    }

    @DisplayName("Check whether given String is palindrome or not")
    @Test
    void testcheckPalindromeOrNot() {
        assertEquals(false, PALINDROME.checkPalindromeOrNot("harish"));
        assertEquals(true, PALINDROME.checkPalindromeOrNot("sis"));
        assertEquals(false, PALINDROME.checkPalindromeOrNot(""));
        assertEquals(false, PALINDROME.checkPalindromeOrNot(null));
        assertEquals(true, PALINDROME.checkPalindromeOrNot("adada"));
        assertEquals(true, PALINDROME.checkPalindromeOrNot("adda"));
        assertEquals(true, PALINDROME.checkPalindromeOrNot("121"));
        assertEquals(false, PALINDROME.checkPalindromeOrNot("-121"));
    }

    @DisplayName("Check whether given String is palindrome or not in Normal way")
    @Test
    void testcheckPalindromeOrNotNormalWay() {
        assertEquals(false, PALINDROME.checkPalindromeNormalWay("harish"));
        assertEquals(true, PALINDROME.checkPalindromeNormalWay("sis"));
        assertEquals(false, PALINDROME.checkPalindromeNormalWay(""));
        assertEquals(false, PALINDROME.checkPalindromeNormalWay(null));
        assertEquals(true, PALINDROME.checkPalindromeNormalWay("adada"));
        assertEquals(false, PALINDROME.checkPalindromeNormalWay("adiuda"));
    }

    @DisplayName("Check whether given String is palindrome or not in Normal way")
    @Test
    void testFindTheLogestPalindrome() {
        Set<String> expected = new TreeSet<>();
        expected.add("bab");
        expected.add("aba");
        Set<String> result = PALINDROME.findLongestPalindrom("babad");
        assertEquals(expected.size(), result.size());

        Set<String> expected2 = new TreeSet<>();
        expected2.add("sahas");
        Set<String> result2 = PALINDROME.findLongestPalindrom("sahasra");
        assertEquals(expected2.size(), result2.size());

        Set<String> expected3 = new TreeSet<>();
        expected3.add("babab");
        Set<String> result3 = PALINDROME.findLongestPalindrom("babab");
        assertEquals(expected3.size(), result3.size());

    }

    @DisplayName("Check given Number is palindrome or not without converting to String")
    @Test
    void testIsPalindrome() {
        assertEquals(false, PALINDROME.isPalindrome(-121));
        assertEquals(true, PALINDROME.isPalindrome(121));
        assertEquals(true, PALINDROME.isPalindrome(1210121));
        assertEquals(false, PALINDROME.isPalindrome(-1210121));
        assertEquals(false, PALINDROME.isPalindrome(15235));
        assertEquals(true, PALINDROME.isPalindrome(152353251));
    }

}
