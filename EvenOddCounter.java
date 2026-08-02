package practice;
import java.util.Scanner;

public class EvenOddCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements (n): ");
        int n = scanner.nextInt();
     
        int[] numbers = new int[n];
       
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
     
        int evenCount = 0;
        int oddCount = 0;
   
        for (int num : numbers) {
          
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
     
        System.out.println("\n-Result");
        System.out.println("Total number of Even elements: " + evenCount);
        System.out.println("Total number of Odd elements: " + oddCount);
    
        scanner.close();
    }
}
