package v1ch03.LotteryDrawing;

import java.util.*;

/**
 * This program demonstrates array manipulation.
 * Created by michael on 2/26/16.
 */
public class LotteryDrawing {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("How much cards do you need:");
        int m = in.nextInt();
        System.out.println("What's the highest number:");
        int n = in.nextInt();

        int[] total = new int[n];
        for (int i=0; i<total.length ; i++)
            total[i] = i + 1;

        int[] result = new int[m];
        for (int j=0; j<result.length; j++)
        {
            int r = (int) (Math.random() * n);
            result[j] = total[r];
            total[r] = total[n-1];
            n--;
        }
        Arrays.sort(result);
        System.out.println("Please follow the sequence:");
        for (int r : result)
            System.out.println(r);
    }
}
