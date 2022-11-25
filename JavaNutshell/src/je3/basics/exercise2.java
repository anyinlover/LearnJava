package je3.basics;

/**
 * Java Examples in a Nutshell Chap1 Exercise2
 * @version 1.1 2018-02-04
 * @author Michael
 */

public class exercise2{
	public static void main(String[] args)
	{
		int[] ThreeFib = new int[20];
		for (int i=0; i<ThreeFib.length; i++)
		{
			if (i<3)
				ThreeFib[i] = 1;
			else
				ThreeFib[i] = ThreeFib[i-1] + ThreeFib[i-2] + ThreeFib[i-3];
		}
		for (int n : ThreeFib)
			System.out.print(n+" ");
	}
}