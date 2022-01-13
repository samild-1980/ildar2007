package course1lesson2;

public class MetoadApp {
    public static void main(String[] args) {
        System.out.println(compare10and20(11, 3));
        printNumbPositiveOrNegative(-5);
        System.out.println(returnTrueIfNunbIsNegative(-9));
        printTextMultipleTimes("Java", 4);
        System.out.println(isYearLeapOrNot(16));
    }
    public static boolean compare10and20(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }
    public static void printNumbPositiveOrNegative(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }
    public static boolean returnTrueIfNunbIsNegative(int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void printTextMultipleTimes(String str, int a) {
        for (int i = 1; i <= a; i++ ) {
            System.out.println(str + i);
        }
    }
    public static boolean isYearLeapOrNot(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
