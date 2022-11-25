package v1ch05.methods;

import java.lang.reflect.*;

/**
 * This program shows how to invoke methods through reflection.
 * Created by michael on 3/5/16.
 * Need to learn again 2/4/2018.
 */
public class MethodTableTest {
    public static void main(String[] args) throws Exception
    {
        Method square = MethodTableTest.class.getMethod("square", double.class);
        Method sqrt = Math.class.getMethod("sqrt", double.class);

        printTable(1, 10, 10, square);
        printTable(1, 10, 10, sqrt);
    }

    /**
     * Returns the square of a number
     * @param x a number
     * @return x squared
     */
    public static double square(double x)
    {
        return x * x;
    }

    /**
     * Prints a table with x- and y-values for a method
     * @param from the lower bound for the x-vaules
     * @param to the upper bound for the x-values
     * @param n the number of rows in the table
     * @param f a method with a double parameter and double return value
     */

    public static void printTable(double from, double to, int n, Method f)
    {
        System.out.println(f);

        double dx = (to - from) / (n - 1);

        for (double x = from; x <= to; x += dx)
        {
            try
            {
                double y = (Double) f.invoke(null, x);
                System.out.printf("%10.4f | %10.4f%n", x, y);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
