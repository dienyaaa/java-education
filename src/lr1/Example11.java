package lr1;

import java.time.Year;
import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input name");
        String name = in.nextLine();
        System.out.println("Input year of birth");
        int year = in.nextInt();

        System.out.printf("Name: %s, Age: %d", name, Year.now().getValue()-year);
    }
}
