package countPairsWithGivenSum;

import java.util.Scanner;

public class CountPairsWithGivenSum {
	public static int getPairsCount(int arr[],int n ,int k) {
	    if (arr == null) {
	        throw new NullPointerException("Input array cannot be null");
	    }

		int count=0;
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++) {	
					if(arr[i]+arr[j]==k)
						count++;			
			}
		}
		return count;
	}
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = 0;
        System.out.print("Enter size of array : ");
        if (sc.hasNextInt()) {
        	
            n = sc.nextInt();    
            if (n <= 0) {
                System.out.println("Invalid size. Size must be positive.");
                return;        
            }
        }
        else
        {
            System.out.println("Invalid input. Please enter a valid integer for size.");
            return;
        }      

        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++)
        {
            if (sc.hasNextInt()) {
                arr[i] = sc.nextInt();
            } else 
            {
                System.out.println("Invalid number entered..");
                return;
            }
        }
        int k=0;
        System.out.println("Enter the sum to check  : ");
        if (sc.hasNextInt()) {
            k = sc.nextInt();
        } else {
            System.out.println("Invalid sum. Please enter a valid integer.");
            return;
        }
        
        System.out.println(getPairsCount(arr, n, k));
        sc.close();
        


	}

}
