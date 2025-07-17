import java.util.Scanner;
public class Swap {
 public static void main(String[] args){
System.out.println("Enter the value of a and b respectively");
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
int c;
c=a;
a=b;
b=c;
System.out.print("After swapping value of a is = ");
System.out.println(a);
System.out.print("After swapping value of b is = ");
System.out.println(b);
    }
    
}

