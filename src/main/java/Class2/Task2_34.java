package Class2;

public class Task2_34 {
    static Double multiply(Double[] array) {
        double number = 5.;
        for (Double i : array) {
            if(i.isNaN()||i.isInfinite()){
                continue;
            }
            number*=i;
        }
        return number;
    }
}
