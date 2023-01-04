package switchExample;

import java.util.Scanner;

public class MainSwitchCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write first number");
        double firstNumberToCount = scanner.nextDouble();

        System.out.println("Choose one sign: +, -, *, /");
        char mathematicalSign = scanner.next().charAt(0);

        System.out.println("Write second number");
        double secondNumberToCount = scanner.nextDouble();

        switch (mathematicalSign) {
            case '+' -> {
                //double res = firstNumberToCount + secondNumberToCount;
                System.out.println("Result: " + (firstNumberToCount + secondNumberToCount));
            }
            case '-' -> {
                //double minus = firstNumberToCount - secondNumberToCount;
                System.out.println("Result: " + (firstNumberToCount - secondNumberToCount));
            }
            case '*' -> {
                //double multiplication = firstNumberToCount * secondNumberToCount;
                System.out.println("Result: " + (firstNumberToCount * secondNumberToCount));
            }
            case '/' -> {
                System.out.println("Result: " + (firstNumberToCount / secondNumberToCount));
            }
            default -> {
                System.out.println("Invalid operator or number!");
            }
        }

    }
}
