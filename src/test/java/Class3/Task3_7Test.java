package Class3;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Task3_7Test {

    @Test
    public void testGetIndexStr() {
        assertEquals(Task3_7.getIndexStr("Denis Dorfirev","Denis"),0);
        assertEquals(Task3_7.getIndexStr("Physic","ys"),2);
        assertEquals(Task3_7.getIndexStr("Abracadabra","da"),6);

    }
}