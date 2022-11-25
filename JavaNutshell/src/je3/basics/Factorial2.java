package je3.basics;

public class Factorial2 {
	public static long factorial (long x) {
		if (x<0) throw new IllegalArgumentException("x must be >= 0");
		if (x<=1) return 1;
		else return x*factorial(x-1);
	}
	public static void main(String[] args){
		for (int i=1; i<=20; i++)
			System.out.println(factorial(i));
	}
}