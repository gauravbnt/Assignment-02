package maxProductSubArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

	public class MaxProductSubArray {
		public static Integer maxProduct(Integer arr[]){
			if(arr.length==1)
				return arr[0];

		Arrays.sort(arr);
		List<Integer> mainList = new ArrayList<>();

		for(int i:arr){
			if(i<0)
				mainList.add(i);
		}

		int temp = 0;

		if(mainList.size()%2!=0)
			temp = mainList.get(mainList.size()-1);

		mainList = new ArrayList<>(Arrays.asList(arr));

		if(temp != 0)
			mainList.remove(mainList.indexOf(temp));

		int mul = 1;
		for(int i:mainList)
		{
			if(i!=0 && i!=1) 
				mul*=i;
		}

		return mul;
	}

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size: ");
		int size = sc.nextInt();

		if(size<=0) {
			System.out.println("Invalid input");
			return;
		}
		Integer arr[] = new Integer[size];
		
		for(int i=0;i<size;i++)
			arr[i] = sc.nextInt();
		
		System.out.println(maxProduct(arr));
	}
 
}


 


 