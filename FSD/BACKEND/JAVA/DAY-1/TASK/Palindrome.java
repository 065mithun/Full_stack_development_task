package day_1;
import java.util.*;
public class Palindrome {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String:");
	String s=sc.nextLine(),st="";
	
	StringBuilder o=new StringBuilder(s);
	st = o.reverse().toString();
    if(st.equals(s)) 
    	System.out.println(s+" is a Palindrome");
    else 
    	System.out.println(s+" is not a Palindrome");
    
    sc.close();
}
}