package v1ch02.Welcome;

/**
 * This program displays a greeting for the reader.
 * Created by michael on 2/26/16.
 */


public class Welcome {
    public static void main(String[] args)
    {
        String greeting = "Welcome to the core java world!";
        System.out.println(greeting);
        for (int i=0; i<greeting.length(); i++)
            System.out.print("=");
        System.out.println();
    }
}
