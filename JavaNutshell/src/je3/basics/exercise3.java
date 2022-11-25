package je3.basics;

/**
 * Java Examples in a Nutshell Chap1 Exercise3
 * @version 1.0 2018-02-04
 * @author Michael
 */

public class exercise3 {
    public static void main(String[] args) {
        try
        {
            int i = Integer.parseInt(args[1]);
            int j = Integer.parseInt(args[2]);
            String s = args[0];
            System.out.println(s.substring(i,j+1));
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("You must specify three argument");
            System.out.println("Usage: java ex3 <string> <number> <number>");
        }
        catch (NumberFormatException e)
        {
            System.out.println("The second and third argument you specify must be integers");
        }
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("Bad argument: " + e.getMessage());
        }
    }
}
