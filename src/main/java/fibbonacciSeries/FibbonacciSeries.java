package fibbonacciSeries;

import java.util.Scanner;

public class FibbonacciSeries {
	
	public int[] fibbonacciSeries(int n)
	{
		if(n<=0)
			return new int[0];

		int fibbo[]=new int[n];
		fibbo[0]=1;

		if(n==1)
			return fibbo;
		fibbo[1]=1;

		for(int i=2;i<n;i++){
			fibbo[i]=fibbo[i-1]+fibbo[i-2];
		}
		
		return fibbo;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FibbonacciSeries fb= new FibbonacciSeries();
		System.out.println("Enter the nth number : ");
		int no=sc.nextInt();
		int arr[]=fb.fibbonacciSeries(no);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		sc.close();

	}
}
