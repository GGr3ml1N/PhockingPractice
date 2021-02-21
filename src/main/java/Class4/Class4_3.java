package Class4;

public class Class4_3 {
    public static String[] getSymbolOnIndex(String[] str, int n) {
        String[] newStr = new String[str.length];
        for (String s : str) {
            if (n > s.length()) {
                throw new StringIndexOutOfBoundsException();
            }
        }
        for (String s : str) {
            if (s == null) {
                throw new NullPointerException();
            }
        }
        for (int i = 0; i < str.length; i++) {
            newStr[i] = str[i].substring(n, n + 1);
        }
        return newStr;
    }
}
