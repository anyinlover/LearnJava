package v1ch03.Retirement;

import java.util.Scanner;
/**
 * This program demonstrate a <code>while</code> loop.
 * Created by michael on 2/26/16.
 */
public class Retirement {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("How much do you have:");
        double balance = in.nextDouble();

        System.out.println("How much do you need:");
        double goal = in.nextDouble();

        System.out.println("How much will you earn every year:");
        double earn = in.nextDouble();

        System.out.println("What's the interest:");
        double interest = in.nextDouble();

        int year = 0;

        while (balance < goal)
        {
            balance *= (1+interest);
            balance += earn;
            year++;
        }

        System.out.println("After " + year + " you can retire.");

    }
}
