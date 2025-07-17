import java.util.Scanner;
public class Array {
    public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
                 //Question 1 sum of no. in array

       /*  float sum=0;
        int i;
        float  numbers[] = {2.2f,5f,5.7f,3.3f,7.6f};
        for(i=0;i<numbers.length;i++){
     sum = sum + numbers[i];
        }
        System.out.println(sum);
        */

              //    Question - 2 - number is in the array or not


/*System.out.println("Enter any no.");
int i,l=0;
int n = sc.nextInt();
int arr[]={1,2,3,4,5};
for(i=0;i<arr.length;i++){
  if( n == arr[i]){
    l=1;
    break;
  }
}
  if(l==1){
  System.out.println("Entered no. is in the array");
  }
  else{
    System.out.println("Entered no. is not in the array");
  }
*/

               // Question - 3 - add two matrix

     /* int i,j,ar1[][]=new int[2][3],ar2[][]=new int[2][3],ar3[][]=new int[2][3];
      System.out.print("Entered the element of array 1 = ");
      for(i=0;i<2;i++){
        for(j=0;j<3;j++){
      ar1[i][j]=sc.nextInt();
        }
        System.out.println();
      }
      System.out.print("Entered the element of array 2 = ");
      for(i=0;i<2;i++){
        for(j=0;j<3;j++){
      ar2[i][j]=sc.nextInt();
        }
        System.out.println();
      }  
      for(i=0;i<2;i++){
        for(j=0;j<3;j++){
          ar3[i][j]= ar1[i][j]+ar2[i][j];
        }
      }
      System.out.println("The sum of the two matris is : ");
      for(i=0;i<2;i++){
        for(j=0;j<3;j++){
          System.out.print(ar3[i][j] + " ");
        }
        System.out.println("                                                         ");
      }
      */

              // Question reverse of array

    /*  int l=7;
     int i,arr[]= new int[l],temp;
     int n = Math.floorDiv(6,2 );
     System.out.println("Enter the element of the array : ");
     for(i=0;i<l;i++){
     arr[i]= sc.nextInt();
     }
  for(i=0;i<n;i++){
temp=arr[i];
arr[i]=arr[l-i-1];
arr[l-i-1]=temp;
  }
  System.out.print("The element of the array after reversed : ");
  for(i=0;i<l;i++){
  System.out.print(arr[i]+" ");
  }

  */

             // Question -4  minimum and maximum no. in array  


   /*  int i,arr[]=new int[5],min,max;
    System.out.println("Enter the element of the array : ");
    for(i=0;i<5;i++){
      arr[i]= sc.nextInt();
    }
    System.out.print("The array is : ");
    for(i=0;i<5;i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println(" ");
    min=arr[0];
    max=arr[0];
    for(i=0;i<5;i++){
if(min>arr[i]){
  min=arr[i];
}
    }
    for(i=0;i<5;i++){
if(max<arr[i]){
  max=arr[i];
}
    }
    System.out.printf("The maximum and minimum value of array is %d and %d respectively.",max,min);
    */

             // Question - 5 check whether the array is sorted or not.

     int arr[]=new int[5],i;
     System.out.println("Enter the element of the array : ");
     for(i=0;i<5;i++){
      arr[i]=sc.nextInt();
     }  
     boolean hi=true;
     for(i=0;i<5-1;i++){
      if(arr[i]>arr[i+1]){
        hi=false;
        break;
      }
     }    
     if(hi==true) {
      System.out.println("The array is sorted.");
     } 
     else{
      System.out.println("The array is not sorted");
     }
    }   
}
