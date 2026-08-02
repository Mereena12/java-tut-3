package practice;
import java.util.Scanner;

public class ArrSumAvg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements (n): ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        int sum = 0;
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }
        double average = (double) sum / n;
        System.out.println("\nResult");
        System.out.println("Sum of the elements: " + sum);
        System.out.printf("Average of the elements: %.2f\n", average);
        scanner.close();
    }
}
