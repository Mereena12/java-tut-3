package practice;
import java.util.Scanner;

public class MaxMinArr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements (n): ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Please enter a valid array size greater than 0.");
            scanner.close();
            return;
        }
        int[] numbers = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        int max = numbers[0];
        int min = numbers[0];
        for (int i = 1; i < n; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
            }
                min = numbers[i]; 
        }
        System.out.println("\nResult");
        System.out.println("Maximum Value: " + max);
        System.out.println("Minimum Value: " + min);
        scanner.close();
    }
}
