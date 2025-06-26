package maxAreaRectangle;

import java.util.Scanner;

class Rectangle {
 int length;
 int breadth;

 Rectangle(int l, int b) {
     this.length = l;
     this.breadth = b;
 }

 int area() {
     return length * breadth;
 }
}

public class MaxAreaRectangle {

 public static int calculate_Area(Rectangle[] rects) {
     int maxArea = 0;
     for (Rectangle r : rects) {
         int area = r.area();
         if (area > maxArea) {
             maxArea = area;
         }
     }
     return maxArea;
 }

 public static void main(String[] args) {
	 Scanner sc= new Scanner(System.in);
     System.out.print("Enter number of rectangles: ");
     if (!sc.hasNextInt()) {
    	  System.out.println("Invalid input..");
    	  return;
    }
     int n = sc.nextInt();
     if (n <= 0) {
         System.out.println(" Invalid input...");
         return;
     }

     Rectangle[] rectangles = new Rectangle[n];

     for (int i = 0; i < n; i++) {
         System.out.println("Enter length and breadth of rectangle " + (i + 1) + ":");
         int length = sc.nextInt();
         int breadth = sc.nextInt();
         if (length <= 0 || breadth <= 0) {
             System.out.println(" Length and breadth must be positive integers.");
             return;
         }
         rectangles[i] = new Rectangle(length, breadth);
     }
    
     int maxArea = calculate_Area(rectangles);
     System.out.println(maxArea);
     
 }
}
