package Class3;

import org.testng.annotations.Test;

public class Task3_19Test {

    @Test
    public void testSet() {
        String str = "здравствуйте михаил сергеевич!";
        String[] arrayStr = Task3_19.parseStringOnArray(str);
        for (String string : arrayStr) {
            System.out.println(string);
        }
    }
}