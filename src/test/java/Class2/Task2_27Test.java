package Class2;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Task2_27Test {

    @Test
    public void testGetNumber() {
        assertEquals(Task2_27.isEven(new int[]{1,2,3,4}), new boolean[]{false,true,false,true});
    }
}