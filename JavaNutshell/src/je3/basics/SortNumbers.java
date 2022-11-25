package je3.basics;


/**
 * Java Examples in a Nutshell Chap1 SortNumbers
 * @version 1.0 2018-02-05
 * @author Michael
 */

public class SortNumbers {
    public static void sort(double[] nums)
    {
        for (int i = 0; i < nums.length; i++)
        {
            int min = i;
            for (int j = i; j < nums.length; j++)
            {
                if (nums[j] < nums[min])
                    min = j;
            }
            double tmp = nums[i];
            nums[i] = nums[min];
            nums[min] = tmp;
        }
    }

    public static void main(String[] args)
    {
        double[] nums = new double[10];
        for (int i = 0; i < nums.length; i++)
            nums[i] = Math.random() * 100;
        sort(nums);
        for (int i = 0; i < nums.length; i++)
            System.out.println(nums[i]);
    }
}
