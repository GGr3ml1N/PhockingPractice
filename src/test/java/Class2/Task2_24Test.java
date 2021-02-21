package Class2;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Task2_24Test {

    @Test
    public void testGetNot() {
        int[] array = new int[]{1,2,3,4,5};
        Task2_24.getNot(array);
        assertEquals(array[0],-2);
        Task2_24.getNot(array);
        assertEquals(array[0],1);
    }
}