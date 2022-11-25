package v1ch03.LotteryOdds;

import java.util.Scanner;

/**
 * This program demonstrates a <code>for</code> loop.
 * Created by michael on 2/26/16.
 */
public class LotteryOdds {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("How much cards do you need:");
        long m = in.nextLong();
        System.out.println("What's the highest number:");
        long n = in.nextLong();

        long pro = 1;
        for (int i=1; i<=m; i++)
            pro = pro * (n - i + 1) / i;

        System.out.printf("You have one in %d chance.%n", pro);
    }
}
