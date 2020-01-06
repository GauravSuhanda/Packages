package bsc.gs.glider;

public class CountStairs {

	// This is to find Nth in Fibonacci Number
	static int fib(int n) {
		if (n <= 1)
			return n;
		return fib(n - 1) + fib(n - 2);
	}

	// Return no of ways to a/b th stair
	static int count1(int a) {
		return fib(a + 1);
	}

	static int count2(int b) {
		return fib(b + 1);
	}

	public static void main(String[] args) {

		int a = 4;
		int b = 10;

		System.out.println(count1(a));
		System.out.println(count2(b));

	}

}
