package Class3;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Task3_4Test {

    @Test
    public void testPalindromeCheck() {
        assertEquals(Task3_4.palindromeCheck("andna"),true);
        assertEquals(Task3_4.palindromeCheck("notIsPalindrome"),false);
        assertEquals(Task3_4.palindromeCheck("i"),true);
    }
}