package v1ch03.LotteryArray;

/**
 * This program demonstrates a triangular array.
 * Created by michael on 2/26/16.
 */
public class LotteryArray {
    public static void main(String[] args)
    {
        final int MAX = 10;

        int[][] odds = new int[MAX+1][];
        for (int n=0; n<=MAX; n++)
            odds[n] = new int[n+1];

        for (int n=0; n<=MAX; n++)
            for (int k=0; k<=n; k++)
            {
                int lotteryOdds = 1;
                for (int i=1; i<=k; i++)
                    lotteryOdds = lotteryOdds * (n-i+1) / i;

                odds[n][k] = lotteryOdds;
            }

        for (int[] row : odds)
        {
            for (int b : row)
                System.out.printf("%4d", b);
            System.out.println();
        }
    }
}
