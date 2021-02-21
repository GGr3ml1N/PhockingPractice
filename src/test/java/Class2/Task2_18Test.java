package Class2;

import org.testng.annotations.Test;

import static org.testng.Assert.assertNull;

public class Task2_18Test {

    @Test
    public void testMaxvalue() {
        int[] array = new int[]{121, 43, 81, 22, 6};
        assertNull(Task2_18.Maxvalue(new int[]{}), null);

    }
}