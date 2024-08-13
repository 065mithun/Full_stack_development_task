package day_1;
import java.util.*;

public class Fibonacci{
      public static void main(String args[]){
                 Scanner sc=new Scanner(System.in);
                 System.out.println("No.of.series:");
                 int n=sc.nextInt();
                 int f=0;
                 int s=1,c=0;     
                 System.out.print(f+" "+s+" ");
                 for(int i=2;i<=n;i++){
                                     
                      c=f+s;
                      System.out.print(c+" ");
                      f=s;
                      s=c;

               }
                 sc.close();
   }
}
