//package abhishek;

import java.util.*;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ar[] = new int[5];
        System.out.println("Enter the element of the array : ");
        for (int i = 0; i < 5; i++) {
            ar[i] = sc.nextInt();
        }
        System.out.print("The array is : ");
        for (int i = 0; i < 5; i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (ar[i] > ar[j]) {
                    int temp;
                    temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;
                }
            }
        }
        System.out.print("The sorted array is :");
           for(int i=0;i<5;i++){
            System.out.print(ar[i]+" ");
           }
           System.out.println();
           System.out.print("The even no. of the array is : ");
           for(int i=0;i<5;i++){
if(ar[i]%2==0){
    System.out.print(ar[i]+" ");
}
           }
           System.out.println();
           System.out.print("The odd no. of array is : ");
for(int i=0;i<5;i++){
if(ar[i]%2!=0){
    System.out.print(ar[i]+" ");
}
}

           }

    }


