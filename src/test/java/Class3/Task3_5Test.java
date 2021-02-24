package Class3;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class Task3_5Test {

    @Test
    public void testDifferentStr() {
        String _1str = "HELLO WORLD";
        String _2str = "hello world";
        String _3str = "YES";
        assertTrue(Task3_5.differentStr(_1str, _2str));
        assertFalse(Task3_5.differentStr(_2str, _2str));
        assertFalse(Task3_5.differentStr(_2str, _3str));
        assertFalse(Task3_5.differentStr(null, _2str));
        assertFalse(Task3_5.differentStr(_1str, null));
        assertFalse(Task3_5.differentStr(null, null));
    }
}