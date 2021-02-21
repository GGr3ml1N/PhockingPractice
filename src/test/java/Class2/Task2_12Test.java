package Class2;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Task2_12Test {

    @Test
    public void testGetDividersOfNumbers() {
        double[] firstArray = Task2_12.getDividersOfNumbers(6);
        assertEquals(firstArray[0], 1, 0.0001);
        assertEquals(firstArray[1], 2, 0.0001);
        assertEquals(firstArray[2], 3, 0.0001);
        assertEquals(firstArray[3], 6, 0.0001);
        assertEquals(firstArray.length, 4, 0.0001);
    }
}