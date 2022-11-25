package je3.basics;
import java.util.Scanner;
/**
 * Java Examples in a Nutshell Chap1 Exercise4
 * @version 1.0 2018-02-04
 * @author Michael
 */

public class exercise4 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        while (!input.equals("tiuq"))
        {
            for (int i=input.length()-1; i >=0; i--)
                System.out.print(input.charAt(i));
            System.out.println();
            input = in.nextLine();
        }
    }
}
