package Fibonacci;

public class Fibonacci {

	public static int fib_rec(int n)
	{
		if(n == 0 || n == 1)
		{
			return n;
		}
		return fib_rec(n-2) + fib_rec(n-1);
	}
	public static void main(String[] args) {
		System.out.println(fib_rec(38));
	}
}

