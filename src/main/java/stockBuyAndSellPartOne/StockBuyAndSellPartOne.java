package stockBuyAndSellPartOne;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StockBuyAndSellPartOne {
	public static List<int[]> stockBuySell(int arr[])
	{
		List<int[]> profitDays = new ArrayList<>();
		int start = 0;
		
		for(int i=0;i<arr.length-1;i++)
		{
			int a[] = new int[2];
			if(arr[i] > arr[i+1])
			{
				a[0] = start;
				a[1] = i;
				if(start != i)
					profitDays.add(a);
				start = i+1;
			}
			else if(i == arr.length-2)
			{
				a[0] = start;
				a[1] = arr.length-1;
				profitDays.add(a);
			}
		}
		List<int[]> arrList = new ArrayList<>();
		for(int [] a: profitDays)
		{
			if(a[0] != a[1])
				arrList.add(a);
		}
		
		if(arrList.isEmpty())
			System.out.println("No Profit");
		return arrList;
	}
	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size: ");
		int size = sc.nextInt();
		if(size <= 0)
		{
			System.out.println("Invalid input");
			return ;
		}
		int arr[] = new int[size];
		for(int i=0;i<size;i++)
			arr[i] = sc.nextInt();
		
		for(int[] a: stockBuySell(arr))
		{
			System.out.println(a[0]+" "+a[1]);
		}
		sc.close();
	}
}
