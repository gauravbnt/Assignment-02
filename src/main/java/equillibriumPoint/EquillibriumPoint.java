package equillibriumPoint;

import java.util.Scanner;

public class EquillibriumPoint {
	public static int equillibriumPoint(int arr[],int n)
	{
		if(n == 1) return 1;
		if(n == 2) return -1;
		
		int temp = 0;
		for(int i=1;i<n-1;i++)// 1 2 4 3 0
		{
			if(getSum(0, i, arr) == getSum(i+1, n, arr))
			{
				temp = i+1;
				break;
			}
			else
				temp = -1;
		}
		return temp;
	}
	private static int getSum(int start,int end, int arr[])
	{
		int sum = 0;
		for(int i=start; i<end; i++)
		{
			sum+=arr[i];
		}
		return sum;
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size: ");
		int size = sc.nextInt();
		if(size == 0)
		{
			System.out.println("Invalid input");
			return ;
		}
		int arr[] = new int[size];
		System.out.println("Enter the elements : ");
		for(int i=0;i<size;i++)
			arr[i] = sc.nextInt();
		
		System.out.println(equillibriumPoint(arr,size));
		sc.close();
	}

}
