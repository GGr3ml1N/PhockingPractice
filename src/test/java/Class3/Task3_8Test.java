package Class3;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Task3_8Test {

    @Test
    public void testIndexof() {
        assertEquals(Task3_8.indexof("Java", "Ja"), -1);
        assertEquals(Task3_8.indexof("tik tok", "tok"),4);

    }
}