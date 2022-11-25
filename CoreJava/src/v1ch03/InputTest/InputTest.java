package v1ch03.InputTest;

import java.util.Scanner;
/**
 * This program demostrates console input.
 * Created by michael on 2/26/16.
 */
public class InputTest {
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("What's your name?");
        String name = in.nextLine();

        System.out.println("How old are you?");
        int age = in.nextInt();

        System.out.println("Hello, " + name + ". You'll be " + (age+1) + " next year.");
    }
}
