package v1ch03.CompoundInterest;

/**
 * This program shows how to store tabular data in a 2D array.
 * Created by michael on 2/26/16.
 */
public class CompoundInterest {
    public static void main(String[] args)
    {
        final double STARTRATE = 10;
        final int NRATES = 6;
        final int NYEARS = 10;

        double[] interest = new double[NRATES];
        for (int i=0; i<NRATES; i++)
            interest[i] = (STARTRATE + i)/100;


        double[][] balance = new double[NYEARS][NRATES];
        for (int i=0; i<NRATES; i++)
            balance[0][i] = 10000;

        for (int i=1; i<NYEARS; i++)
            for (int j=0; j<NRATES; j++)
                balance[i][j] = balance[i-1][j]*(1+interest[j]);

        for (double i : interest)
            System.out.printf("%9.0f%%", 100*i);
        System.out.println();

        for (double[] row : balance)
        {
            for (double b : row)
                System.out.printf("%10.2f", b);
            System.out.println();
        }
    }
}
