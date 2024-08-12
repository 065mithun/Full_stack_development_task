import java.util.*;
public class MyDataType{
    public static void main(String args[]){
           int empid;
           String empname;
           float empsalary;
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter employee id:");
           empid = sc.nextInt();
           System.out.println("Enter employee name:");
           empname = sc.next();
           System.out.println("Enter employee salary:");
           empsalary = sc.nextFloat();


          System.out.println(empid+" "+empname+" "+empsalary);
           
     }
}