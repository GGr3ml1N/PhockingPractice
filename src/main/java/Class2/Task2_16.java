package Class2;

public class Task2_16 {
    static boolean setFunction(Integer[] array) {
        for (int i : array) {
            if (array[i] == null) {
                return true;
            }
        }
        return false;
    }
}
