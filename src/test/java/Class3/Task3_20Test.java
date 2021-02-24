package Class3;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Task3_20Test {

    @Test
    public void testGetUnifiedStr() {
        String[] str = {"Understandable", "have", "a", "nice", "day"};
        assertEquals(Task3_20.getUnifiedStr(str), "Understandable, have, a, nice, day");
    }
}