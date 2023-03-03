package lr1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input number: ");
        double num = in.nextDouble();

        double prevNum = num - 1;
        double nextNum = num + 1;
        double powerOfNums = (num + prevNum + nextNum) * (num + prevNum + nextNum);

        System.out.println("Num-1 Num Num+1 (Num-1 + Num + Num+1)^2");
        System.out.printf("%.2f %.2f %.2f %.2f", prevNum, num, nextNum, powerOfNums);
    }
}
