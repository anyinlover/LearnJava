package v1ch03.BigIntegerTest;

import java.util.Scanner;
import java.math.BigInteger;

/**
 * This program uses big numbers to compute the odds of winning the grand prize in a lottery.
 * Created by michael on 2/26/16.
 */
public class BigIntegerTest {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("How much cards do you need:");
        int m = in.nextInt();
        System.out.println("What's the highest number:");
        int n = in.nextInt();

        BigInteger pro = BigInteger.valueOf(1);

        for (int i=1; i<=m; i++)
        {
            pro = pro.multiply(BigInteger.valueOf(n-i+1)).divide(BigInteger.valueOf(i));
        }

        System.out.println("You are one in " + pro);

    }
}
