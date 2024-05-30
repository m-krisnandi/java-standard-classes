package classes;

public class NumberApp {
    public static void main(String[] args) {
        Integer intValue = 10;

        Long longValue = intValue.longValue();
        Double doubleValue = longValue.doubleValue();
        Short sortValue = doubleValue.shortValue();
        System.out.println(sortValue);

        String num = "100.10";

        Double numInt = Double.valueOf(num);
        System.out.println(numInt);
    }
}
