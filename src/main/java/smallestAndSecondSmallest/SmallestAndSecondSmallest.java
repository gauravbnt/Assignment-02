package smallestAndSecondSmallest;

import java.util.*;

public class SmallestAndSecondSmallest {

    public static int[] minAndSecondMin(int[] array, int n) {
        Set<Integer> treeSet = new TreeSet<>();
        for (int num : array) {
            treeSet.add(num);
        }

        Integer[] sortedUniqueArray = treeSet.toArray(new Integer[0]);

        if (sortedUniqueArray.length == 0) {
            return new int[]{-1, -1}; 
        } else if (sortedUniqueArray.length == 1) {
            return new int[]{sortedUniqueArray[0], -1};
        } else {
            return new int[]{sortedUniqueArray[0], sortedUniqueArray[1]};
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = 0;

        while (true) {
            System.out.print("Enter the size of the array : ");
            if (sc.hasNextInt()) {
                len = sc.nextInt();
                if (len > 0) {
                    break;
                } else {
                    System.out.println("❌ Size must be greater than 0.");
                }
            } else {
                System.out.println("❌ Invalid input. Please enter a valid integer.");
                sc.next(); 
            }
        }

        int[] array = new int[len];

        System.out.println("Enter " + len + " integer elements:");
        for (int i = 0; i < len; ) {
            if (sc.hasNextInt()) {
                array[i] = sc.nextInt();
                i++;
            } else {
                System.out.println("❌ Invalid input. Please enter an integer.");
                sc.next(); 
            }
        }

        // Get result
        int[] result = minAndSecondMin(array, len);

        System.out.println("Smallest: " + result[0]);
        System.out.println("Second Smallest: " + result[1]);
        sc.close();
    }
}
