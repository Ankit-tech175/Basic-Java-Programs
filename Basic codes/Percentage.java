import java.util.Scanner;
public class Percentage {
public static void main(String[] args){
    System.out.println("Enter marks of each subject");
Scanner sc = new Scanner(System.in);
float S1 = sc.nextFloat();
float S2 = sc.nextFloat();
float S3 = sc.nextFloat();
float S4 = sc.nextFloat();
float S5 = sc.nextFloat();
Float sum = S1+S2+S3+S4+S5;
float Percentage = (sum)/5;
System.out.print("Percentage = ");
System.out.println(Percentage);
}


}