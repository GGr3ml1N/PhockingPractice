package Class2;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class Task2_20Test {

    @Test
    public void testSetArray() {
        int[] array = new int[]{3, 6, 9, 12, 15, 21, 6};
        assertTrue(Task2_20.setArray(array));
        int[] _1array = new int[]{20,3,6,9,12,15,21,3};
        assertFalse(Task2_20.setArray(_1array));
    }
}