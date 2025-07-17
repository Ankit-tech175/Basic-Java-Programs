import java.util.*;
public class Quick {

    public static int partition(int ar[], int lb,int ub){
       int pivot=ar[lb];
       int start=lb;
       int end=ub;
       while(start<end){
        while(ar[start]<=pivot){
            start++;
        }
        while(ar[end]>pivot){
            end--;
        }
        if(start<end){
        int temp=ar[start];
        ar[start]=ar[end];
        ar[end]=temp;
        }
       }
       int temp=ar[lb];
        ar[lb]=ar[end];
        ar[end]=temp;
        return end;
    }
    public static void quicksort(int[]  ar,int lb,int ub){
        if(lb<ub){ 
          int loc= partition(ar, lb, ub);
          quicksort( ar,lb,loc-1);
          quicksort(ar,loc+1,ub);
        }
    }
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
        int lb=0;
        int ub=n-1;
        
        quicksort(ar,lb, ub);

        System.out.print("The sorted array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.println();
    }
    
}
