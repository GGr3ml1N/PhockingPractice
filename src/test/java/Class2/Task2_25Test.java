package Class2;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Task2_25Test {

    @Test
    public void testGetArrayNot() {
        int[] array = new int[]{1,2,3,4,5};
        int[] arrayNot = Task2_25.getArrayNot(array);
        assertEquals(arrayNot[0],-2);
        assertEquals(array[0],1);

    }
}