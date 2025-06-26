package uniqueSubsets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class UniqueSubsets {

	public static List<List<Integer>> getAllSubsets(int arr[], int no) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());
 
        for (int num : arr) {
            List<List<Integer>> newSubset = new ArrayList<>();
            for (List<Integer> existing : list) {
 
                List<Integer> newSet = new ArrayList<>(existing);
                newSet.add(num);
 
                if (!list.contains(newSet) && !newSubset.contains(newSet))
                    newSubset.add(newSet);
            }
            list.addAll(newSubset);
        }
        return list;
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
 
        Arrays.sort(arr);
        List<List<Integer>> result = getAllSubsets(arr, size);
        for (List<Integer> ans : result) {
            System.out.println(ans);
        }
        sc.close();
	}

}
