package zigZagArray;
import java.util.Scanner;

public class ZigZagArray {

    public static void zigZag(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            if (i % 2 == 0) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            } else {
                if (arr[i] < arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Function to check if array is in Zig-Zag form
    public static int isZigZag(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            if (i % 2 == 0 && arr[i] >= arr[i + 1]) return 0;
            if (i % 2 == 1 && arr[i] <= arr[i + 1]) return 0;
        }
        return 1;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Invalid size.");
            return;
        }

        int[] arr = new int[n];
        System.out.println("Enter " + n + " distinct integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        // Print Zig-Zag array
        System.out.print("Zig-Zag Array: ");
        for (int val : arr) {
            System.out.print(val + " ");
        }

        // Output 1 if correct zig-zag, else 0
        System.out.println("\nIs Zig-Zag valid? " + isZigZag(arr, n));

        sc.close();
    }
}
