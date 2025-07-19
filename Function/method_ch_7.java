                                 // practice set 7


                                 //Q -1 table
// import java.util.*;
// public class method_ch_7 {
//     static void mul(int n){
//         for(int i=1;i<=10;i++){
//            System.out.printf("%d X %d = %d",n,i,(n*i));
//            System.out.println();
//         }
//     }
//    public static void main(String[] args) {
//     Scanner sc =new Scanner(System.in);
//     System.out.println("Enter the value of a : ");
//     int a = sc.nextInt();
//     mul(a);
//    } 
// }
                  
                                // Q-2 pattern by method

//  import java.util.*;
// public class method_ch_7 {
//     static void pat(int n){
//         for(int i=1;i<=10;i++){
//            for(int j=0;j<=i;j++){
//              System.out.print("* ");
//                 }
//            System.out.println();
//         }
//     }
//    public static void main(String[] args) {
//     Scanner sc =new Scanner(System.in);
//     System.out.print("Enter the no. of rows : ");
//     int a = sc.nextInt();
//     pat(a);
//    } 
// }

                // Q-3  sum of first n no. by recursive function

// import java.util.*;
// public class method_ch_7 {
//     static int Rs(int n){
//         if(n==1){
//             return 1;
//         }
//         return n + Rs(n-1);
//         }
//    public static void main(String[] args) {
//     Scanner sc =new Scanner(System.in);
//     System.out.print("Enter the value of a : ");
//     int a = sc.nextInt();
//     int c= Rs(a);
//     System.out.println("The sum of first n no. is : "+c);
//    } 
// }

                 // Q-4 fibonacci by recursion 

import java.util.*;
public class method_ch_7 {
    static int fibo(int n){
        if(n==1){
            return 0;
        }
        else if(n==2){
            return 1;
        }
        else{
        return fibo(n-1)+fibo(n-2);
        }
    }
   public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter the value of a : ");
    int a = sc.nextInt();
    System.out.print("The first n terms of fibonacci series is : ");
    for(int i=1;i<=a;i++){
   System.out.print(fibo(i)+" ");
    } 
   } 
} 
                                  
             // Q-5 sum of set no. by function passed as arguments


// import java.util.*;
// public class method_ch_7{
//     static float set(int... n){
//         int sum=0;
//       for(int i : n){
//         sum=sum+i;
//       }
//       return sum/n.length;
//         }
//    public static void main(String[] args) {
//     Scanner sc =new Scanner(System.in);
//     float c= set(10,20,30,40,50);
//     System.out.println("The average of no. of set is : "+c);
//    } 
// }


               // Q-6 pattern by recursion

//  import java.util.*;
// public class method_ch_7 {
//     static void pat(int n){
//         if(n>0){
//             // pat(n-1);
//         for(int i=1;i<=n;i++){
//              System.out.print("* ");
//         }
//         System.out.println();
//         pat(n-1);
//     }
// }
//    public static void main(String[] args) {
//     Scanner sc =new Scanner(System.in);
//     System.out.print("Enter the no. of rows : ");
//     int a = sc.nextInt();
//     pat(a);
//    } 
// }
