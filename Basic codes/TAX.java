import java.util.Scanner;
public class TAX {
    public static void main(String[] args) {
        System.out.println("Enter your annual income in lakhs");
     Scanner sc = new Scanner(System.in);
     float income = sc.nextFloat();
     float tax = 0;
if (income<=2.5f) {

   tax = tax + 0f; 
}

else if (income>2.5f && income<=5f) {
    tax = tax + 0.05f*(income-2.5f);
    
}
else if (income>5f && income<=10f) {
    tax = tax + 0.05f*(income-2.5f);
    tax = tax + 0.2f*(income-5f);
}
else if  (income>10f) {
    tax = tax + 0.05f*(income-2.5f);
    tax = tax + 0.2f*(income-5f);
    tax = tax + 0.3f*(income-30f);
}
tax = tax*100000;

System.out.print("According to your annual income you must have to paid " + tax + " ruppees.");
    }
    
}
