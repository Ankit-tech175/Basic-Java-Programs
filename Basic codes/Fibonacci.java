
import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
     Scanner sc = new Scanner (System.in);
     int a=0,b=1,c;
     System.out.print("Enter the value : ");
     int n =sc.nextInt();
     System.out.println("The fabonacci series is : ");
     System.out.println(a);
     System.out.println(b);
     while((n-2)!=0){
        c=a+b;
        a=b;
        b=c;
        n--;
      System.out.println(c);
     }

    }
    
}
