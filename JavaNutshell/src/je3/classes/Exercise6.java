package je3.classes;

/**
 * Java Examples in a Nutshell Chap2 Exercise6
 * @version 1.0 2018-02-05
 * @author Michael
 */

import java.util.Arrays;
import java.util.Random;

public class Exercise6 {
    public static void main(String[] args)
    {
        IntList[] ill = new IntList[5];
        Random generator = new Random();
        for (int i = 0; i < ill.length; i++)
        {
            ill[i] = new IntList();
            for (int j = 0; j < 10; j++)
            {
                int r = generator.nextInt(100);
                ill[i].add(r);
            }
        }

        Arrays.sort(ill);
        for (IntList il : ill)
            System.out.println(il);

    }
}
