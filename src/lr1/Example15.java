package lr1;

import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input first number: ");
        double firstNum = in.nextDouble();
        System.out.println("Input first number: ");
        double secondNum = in.nextDouble();

        System.out.printf("Sum of numbers: %.2f %n", firstNum + secondNum);
        System.out.printf("Difference of numbers: %.2f", firstNum - secondNum);
    }
}
