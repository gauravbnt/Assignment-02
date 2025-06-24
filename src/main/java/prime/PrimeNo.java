package prime;

import java.util.Scanner;

public class PrimeNo {
	 static int primeNo(int num) {
		if(num<=1)
			return 0;
		int c=2;
		while(c<=num/2) {
			if(num%c==0){
				return 0;
			}
			c++;	
		}
		return 1;		
	}
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		if(sc.hasNextInt()){
			int num=sc.nextInt();
			System.out.println(primeNo(num));
		}
		else{
			System.out.println("Invalid Number");
		}	
		sc.close();
	}
}
