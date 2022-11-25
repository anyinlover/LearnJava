package je3.basics;

import java.util.Random;
import java.util.Scanner;
/**
 * Java Examples in a Nutshell Chap1 Exercise5
 * @version 1.0 2018-02-04
 * @author Michael
 */

public class exercise5 {
    public static void sort(double[] nums)
    {
        for (int i=0; i<nums.length; i++)
        {
            int min = i;
            for (int j=i; j < nums.length; j++)
            {
                if (nums[j] < nums[min]) min = j;
            }
            double tmp = nums[i];
            nums[i] = nums[min];
            nums[min] = tmp;
        }
    }

    public static void main(String[] args)
    {
        double[] nums = new double[100];
        Random r = new Random();
        for (int i=0; i<nums.length; i++)
            nums[i] = r.nextDouble() * 100;
        sort(nums);
        for (double num : nums)
            System.out.print(num + " ");
        System.out.println();
        System.out.println("Please enter a number:");
        Scanner in = new Scanner(System.in);
        double number = in.nextDouble();

        int i = 0;
        int j = nums.length-1;
        if (nums[i] >= number || nums[j] <= number) {
            System.out.println("The number is too large or too small");
            System.exit(1);
        }
        while (j - i > 1)
        {
            int mid = (i+j) / 2;
            if (number < nums[mid])
                j = mid;
            else
                i = mid;
        }
        if (number == nums[i]) {
            System.out.println("Larger Number: " + nums[i + 1]);
            System.out.println("Smaller Number: " + nums[i - 1]);
        }
        else {
            System.out.println("Larger Number: " + nums[i+1]);
            System.out.println("Smaller Number: " + nums[i]);
        }

    }
}
