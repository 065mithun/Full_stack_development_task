package day_1;
import java.util.*;
public class ASCIIValue {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Character:");
    char a=sc.next().charAt(0);
    int n= a;
    System.out.println("ASCII value of the "+a+" is : "+n);
    sc.close();
	}
}
