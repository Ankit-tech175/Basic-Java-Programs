import java.util.*;
public class Bubble {
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
        for(int i=0;i<n;i++){
            int flag=0;
        for(int j=i+1;j<n;j++){
        if(ar[j]<ar[i]){
          int temp = ar[i];
          ar[i]=ar[j];
          ar[j]=temp;
          flag=1;
        }
        }
        if(flag==0){
            break;
        }
        }

        System.out.print("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(ar[i] + " ");
        }

    }

    
}
