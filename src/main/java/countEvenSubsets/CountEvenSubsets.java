package countEvenSubsets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class CountEvenSubsets {

	public static int getCountForEvenSubset(int arr[], int n) {
        Set<Integer> evenSet = new HashSet<>();
        for (int num : arr) {
            if (num % 2 == 0) {
                evenSet.add(num); 
            }
        }
        List<Integer> evenList = new ArrayList<>(evenSet);
        int count = (1 << evenList.size()) - 1; // uses formula 2^size-1
        return count;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size = sc.nextInt();
        if (size < 0) {
            System.out.println("Invalid input");
           
            return;
        }
 
        int arr[] = new int[size];
        System.out.println("Enter elements in array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
 
        System.out.println("Count of even subsets:" + getCountForEvenSubset(arr, size));
        sc.close();
    }

}


