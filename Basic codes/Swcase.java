
import java.util.Scanner;
public class Swcase {
    public static void main(String[] args) {
        System.out.println("Enter any no. from 1 to 7");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
switch (day)
{
 case 1 :
 {
  System.out.println(" According to your choice the day is : MONDAY");
  break;
}

 case 2 :
 {
    System.out.println(" According to your choice the day is : TUESDAY");
    break;
 }
 case 3 :
 {
  System.out.println(" According to your choice the day is : WEDNESDAY");
  break;
 }
case 4 :
 { System.out.println(" According to your choice the day is : THRUSDAY");
 break;
}
 case 5 :
 { System.out.println(" According to your choice the day is : FRIDAY");
 break;
}
 case 6 :
 {
    System.out.println(" According to your choice the day is : SATURDAY");
    break;
 }
 default :
 {
     System.out.println(" According to your choice the day is : SUNDAY");
}
}
    }
    
}
