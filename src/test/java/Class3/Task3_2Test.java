package Class3;

import org.testng.annotations.Test;

public class Task3_2Test {

    @Test
    public void testGetStr() {
        String temp = "hello world";
        new Task3_2().getStr(temp);
        String _2temp = "Хеллоу ворлд";
        new Task3_2().getStr(_2temp);
    }
}