package equillibriumPoint;

import java.util.Scanner;

public class EquillibriumPoint {
	public static int equillibriumPoint(int arr[], int n) {
	    if (arr == null) throw new NullPointerException("Array is null");
	    if (n <= 0) return -1;
	    if (n > arr.length) throw new ArrayIndexOutOfBoundsException("Size > array length");
	    if (n == 1) return 1;
	    if (n == 2) return -1;

	    int temp = -1;
	    for (int i = 1; i < n - 1; i++) {
	        if (getSum(0, i, arr) == getSum(i + 1, n, arr)) {
	            temp = i + 1;
	            break;
	        }
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
