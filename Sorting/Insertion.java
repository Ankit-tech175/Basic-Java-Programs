import java.util.*;
public class Insertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] ar = new int[n];
        
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        System.out.print("The array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(ar[i] + " "); 
        }
        System.out.println();
        
        for(int i=1;i<n;i++){
         int j=i-1;
         int temp=ar[i];
         while(j>=0 && ar[j]>temp){
             ar[j+1]=ar[j];
                j--;
         }
         ar[j+1]=temp;

        }
        System.out.print("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(ar[i] + " ");
        }

    }
    
}
