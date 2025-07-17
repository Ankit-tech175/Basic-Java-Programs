import java.util.Scanner;

public class Types {
    public static void main(String[] args) {

                //Two types of string entered by user (Format 1) 

     //String name = new String("Ankit") ;
    // String name = "ANKIT";
    // System.out.printf("Hello ");
    // System.out.format(name);
     //System.out.println(" What are you doing ?");

                           // Format 2
      //int a = 69;
      //float b = 6;                                
      // System.out.printf("The value of a and b are %d and %.1f respectively", a ,b);  
    
                      //Format 3 - you can replace any thing by different string methods.

   // String text ="Hello  Ankit   Chauhan";
   // text = text.replace(" ", "_");
    //System.out.println(text);

    String text = "Hello  Ankit Chauhan";
    System.out.println(text.indexOf("  "));
    System.out.println(text.indexOf("   "));
    }
    
}
