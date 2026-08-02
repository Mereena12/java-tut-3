package practice;
import java.util.Scanner;
import java.util.Arrays;
public class ArrSortAcsend {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of elements: ");
	        int size = scanner.nextInt();
	        int[] numbers = new int[size];
	        System.out.println("Enter " + size + " integers:");
	        for (int i = 0; i < size; i++) {
	            System.out.print("Element " + (i + 1) + ": ");
	            numbers[i] = scanner.nextInt();
	        }
	        scanner.close();
	        System.out.println("\nOriginal Array: " + Arrays.toString(numbers));
	        Arrays.sort(numbers);
	        System.out.println("Sorted Array (Ascending): " + Arrays.toString(numbers));
	    }
	}
