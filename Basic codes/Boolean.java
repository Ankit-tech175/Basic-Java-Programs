import java.util.Scanner;
public class Boolean {
public static void main(String[] args) {
    System.out.println("Check weather entered no. is integer or not.");
    System.out.println("Enter any number");
    Scanner sc = new Scanner(System.in);
    boolean a= sc.hasNextInt();
    System.out.println(a);
}
}

