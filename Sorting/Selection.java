import java.util.Scanner;

public class Selection {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Read the size of the array
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] ar = new int[n];
        
        // Read the elements of the array
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        
        // Display the input array
        System.out.print("The array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.println();

        // Selection Sort Algorithm
        for (int i = 0; i < n - 1; i++) {
            int min = i; // Assume the current index is the smallest
            
            // Find the minimum element in the remaining array
            for (int j = i + 1; j < n; j++) {
                if (ar[j] < ar[min]) {
                    min = j;    
                }
            }
            
            // Swap if a smaller element was found
            if (min != i) { 
                int temp = ar[i];
                ar[i] = ar[min];
                ar[min] = temp;
            }
        }
        
        // Display the sorted array
        System.out.print("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(ar[i] + " ");
        }
        
        sc.close(); // Close the scanner to prevent resource leaks
    }
}
