package practice;
import java.util.Scanner;

public class ArrayDisplayOrder {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements (n): ");
        int n = scanner.nextInt();
        
        int[] numbers = new int[n];
      
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
      
        System.out.println("\nArray elements in the same order:");
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }
       
        System.out.println("\n\nArray elements in reverse order:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }

        scanner.close();
    }
}
