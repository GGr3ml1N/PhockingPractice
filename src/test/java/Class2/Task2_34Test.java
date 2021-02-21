package Class2;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Task2_34Test {

    @Test
    public void testMultiply() {
        assertEquals(Task2_34.multiply(new Double[]{1., 2., Double.NaN,
                Double.NEGATIVE_INFINITY,
                Double.POSITIVE_INFINITY}).doubleValue(),
                10.);
    }
}