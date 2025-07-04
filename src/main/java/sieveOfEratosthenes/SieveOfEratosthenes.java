package sieveOfEratosthenes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SieveOfEratosthenes {
    public static List<Integer> sieveOfEratosthenes(int N) {

	List<Integer> primes = new ArrayList<>();
	
    if (N < 2) {
        return primes; 
    }

    boolean[] isPrime = new boolean[N + 1];
    

    for (int i = 2; i <= N; i++) {
        isPrime[i] = true;
    }
    
    for (int i = 2; i * i <= N; i++) {
        if (isPrime[i]) {
            for (int j = i * i; j <= N; j += i) {
                isPrime[j] = false;
            }
        }
    }
    for (int i = 2; i <= N; i++) {
        if (isPrime[i]) {
            primes.add(i);
        }
    }

    return primes;
}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range  : ");
		if(sc.hasNextInt()) {
			int n=sc.nextInt();
			if(n<0)
			{
				System.out.println("Invalid input..");
				return;
			}
			System.out.println(sieveOfEratosthenes(n));
		
		}
		else
			System.out.println("Invalid input...");

		
			sc.close();
	}

}
