package day_1;
import java.util.*;
public class AmstrongNumber {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the Number:");
   int num=sc.nextInt(),temp=num,n=num,sum=0,d=0,re=0;
   while(n>0) {
	   re=n%10;
	   d++;
	   n/=10;
   }
   while(temp>0) {
	   int rem=temp%10;
	   sum+=Math.pow(rem, d);
	   temp/=10;
   }
   if(num==sum)
	    System.out.println(num+" is a Amstrong Number");
   else
	   System.out.println(num+" is not a  Amstrong Number");
   sc.close();
}
}
