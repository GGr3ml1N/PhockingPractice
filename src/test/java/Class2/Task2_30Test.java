package Class2;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Task2_30Test {

    @Test
    public void testGetVector() {
        assertEquals(Task2_30.getVector(3), new int[][]{{1, 2, 3}, {4,5}, {6}});
    }
}