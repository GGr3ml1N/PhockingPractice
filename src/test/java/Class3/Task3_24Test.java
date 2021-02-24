package Class3;

import org.testng.annotations.Test;

import java.nio.charset.StandardCharsets;

public class Task3_24Test {

    @Test
    public void testChangeCharsetStr() {
        String str = "hello world";
        Task3_24.changeCharsetStr(str, StandardCharsets.UTF_8, StandardCharsets.UTF_16LE);
        Task3_24.changeCharsetStr(str,StandardCharsets.UTF_16LE,StandardCharsets.UTF_8);
    }
}