package lr1;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input a name: ");
        String name = in.nextLine();

        System.out.println("Input an age: ");
        int age = in.nextInt();

        System.out.printf("Name: %s, Age: %d", name, age);
    }
}
