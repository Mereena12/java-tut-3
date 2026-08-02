package practice;
import java.util.Scanner;

public class NumSearchArr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element at index " + i + ": ");
            numbers[i] = scanner.nextInt();
        }
        System.out.print("Enter the number you want to search for: ");
        int target = scanner.nextInt();
        int foundPosition = -1; 

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                foundPosition = i + 1; 
                break; 
            }
        }
        if (foundPosition != -1) {
            System.out.println("Number " + target + " found at position: " + foundPosition);
        } else {
            System.out.println("Number " + target + " was not found in the array.");
        }
        scanner.close();
    }
}
