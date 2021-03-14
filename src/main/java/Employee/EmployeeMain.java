package employee;
import java.util.*;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 
public class EmployeeMain 
{
    int empno;
    String name;
    int doj;
    int sal;

    public String getName() {
        return name;
    }

    public int getEmpno() {
        return empno;
    }
    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDoj(int doj) {
        this.doj = doj;
    }

  

    public int getDoj() {
        return doj;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

  

    public int getSal() {
        return sal;
    }
    
    
    void show()
    {
       System.out.println("The name is "+getName()+" and join date is "+getDoj());
    }
    
    public static void main(String[] args) {
        
            EmployeeMain e= new EmployeeMain();
            e.setDoj(2015);
            e.setName("roja");
             e.setSal(48000);
            e.setEmpno(108);
            int  monthlysal=e.getSal();
            int yearlysal;
               System.out.println( "the emp Id is : "+e.getEmpno());
              LocalDateTime current = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy");
        String formatted = current.format(formatter);
       // System.out.println(formatted);
       int currentYear=Integer.parseInt(formatted);
       e.show();
       //eligible or not
     if( (currentYear-e.getDoj())>5)
           {
              System.out.println(  "eligible for award");
           }    

           else
           {
                System.out.println("not eligible");
           }
   //odd even code
       if(e.getEmpno()%2==0)
       {
           System.out.println("your employeeno  even" );
       }
       else
           System.out.println("your employeeno not even" );
       
       //salary calculation
       if(monthlysal/10000 <=2)
       {
          System.out.println("0 percent tax" );
       }
       else if(monthlysal/10000 ==3)
       {
           System.out.println("10 percent tax" );
       }
        else if(monthlysal/10000 ==4)
       {
           System.out.println("20 percent tax" );
       }
          else
         {
           System.out.println("30 percent tax" );
       }
       //yearly sal calcu
       yearlysal=monthlysal*12;
       System.out.println("yearlysal : "+ yearlysal);
}
}
