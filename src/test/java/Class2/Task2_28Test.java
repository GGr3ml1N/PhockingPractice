package Class2;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Task2_28Test {

    @Test
    public void testLongToInt() {
        assertEquals(Task2_28.intToLong(Task2_28.longToInt(1095L)), 1095L);
        assertEquals(Task2_28.intToLong(Task2_28.longToInt(9L)), 9L);
    }
}