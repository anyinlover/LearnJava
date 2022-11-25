package v1ch03.Retirement2;

import java.util.Scanner;

/**
 * This program demonstrates a <code>do/while</code>;
 * Created by michael on 2/26/16.
 */
public class Retirement2 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("How much do you have:");
        double balance = in.nextDouble();

        System.out.println("How much will you earn every year:");
        double earn = in.nextDouble();

        System.out.println("What's the interest:");
        double interest = in.nextDouble();

        int year = 0;

        String answer;

        do {
            balance *= (1+interest);
            balance += earn;
            year++;

            System.out.printf("After %d years, you have %,.2f%n", year, balance);
            System.out.println("Do you want to retire? Y/N");
            answer = in.next();
        }
        while (answer.equals("N"));
    }
}
