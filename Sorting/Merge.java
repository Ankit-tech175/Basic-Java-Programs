import java.util.*;
public class Merge {
    public static void Mergesort(int[] ar,int lb,int ub){
       if(lb<ub){
      int mid=(lb+ub)/2;
      Mergesort(ar,lb,mid);
      Mergesort(ar,mid+1,ub);
      merge(ar,lb,mid,ub);
       }
    }
    public static void merge(int[] ar,int lb,int mid,int ub){
      int i=lb;
      int j=mid+1;
      int k=0;
      int[] arr= new int[ub-lb+1];
      while(i<=mid&&j<=ub){
           if(ar[i]<=ar[j]){
            arr[k]=ar[i];
            i++;
           }
           else{
            arr[k]=ar[j];
            j++;
           }
           k++;
      }
      if(i>mid){
        while(j<=ub){
            arr[k]=ar[j];
            j++;
            k++;
        }
      }
      else{
        while(i<=mid){
            arr[k]=ar[i];
            i++;
            k++;
        }
      }
      for( k=0;k<arr.length;k++){
       ar[lb+k]=arr[k];
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
        Mergesort(ar,lb,ub);  
      System.out.print("The sorted array is: ");
        for (int i = 0; i< n; i++) {
            System.out.print(ar[i] + " "); 
        }
        System.out.println();
    }
}
