package Class3;

public class Task3_4 {
    static boolean palindromeCheck(String str){
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
