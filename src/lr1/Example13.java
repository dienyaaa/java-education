package lr1;

import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input your first number: ");
        double firstNumber = in.nextDouble();
        System.out.println("Input your second number: ");
        double secondNumber = in.nextDouble();

        System.out.printf("The sum of two numbers is %.2f", firstNumber + secondNumber);
    }
}
