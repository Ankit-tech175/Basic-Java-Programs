class Employee{

    int salary;
    String name;

    public int getsalary(){
        return salary;
    }

    public String getname(){
        return name;
    }

    public void setname(String n){
        name=n;
    }
}
class rect{

    int a,b;

    public int area(){
       return a*b;
    }

    public int peri(){
         return 2*(a+b);
    }
}
class cir{

    int r;
    double pi= 3.14;

    public double area(){
        return pi*r*r;
    }

    public double peri(){
        return pi*2*r;
    }
}
public class classes {
    
           public static void main(String[] args) {

                 // Q-1 

        //        Employee a = new Employee();
        //        a.setname("Ankit Chauhan");
        //        a.salary= 233;
        //        System.out.println(a.getsalary());
        //        System.out.println(a.getname());
        
    
                 //Q-2
       
        // rect a =new rect();
        // a.a=2;
        // a.b=4;    
        // System.out.println(a.area()); 
        // System.out.println(a.peri());    
    
                 // Q-3 

     cir a =new cir();
     a.r=3;
     System.out.println(a.area());
     System.out.println(a.peri());
    }
           
       }