package Class3;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Task3_12Test {

    @Test
    public void testSet() {
        assertEquals(new Task3_12().set("opopopopo", "opo", "po"), "popppo");
    }
}