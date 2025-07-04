package fibbonacciNumber;

import java.util.Scanner;

public class FibbonacciNumber {

	public int fibbonacci(int n) {
	    if (n < 0) {
	        throw new IllegalArgumentException("n must be non-negative");
	    }

	    int a = 0, b = 1;
	    int d = 1_000_000_007;

	    if (n == 0) return 0;
	    if (n == 1) return 1;

	    for (int i = 2; i <= n; i++) {
	        int c = (a + b) % d;
	        a = b;
	        b = c;
	    }
	    return b;
	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FibbonacciNumber fb= new FibbonacciNumber();
		System.out.println("Enter the nth number : ");
		int no=sc.nextInt();
		System.out.println(fb.fibbonacci(no));
		sc.close();
	}

}
