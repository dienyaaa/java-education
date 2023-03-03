package lr1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input day of week: ");
        String dayOfWeek = in.nextLine();

        System.out.println("Input month name: ");
        String month = in.nextLine();

        System.out.println("Input number of the day in the month: ");
        int date = in.nextInt();

        System.out.printf("Today is %s, %s %s", dayOfWeek, date, month);
    }
}
