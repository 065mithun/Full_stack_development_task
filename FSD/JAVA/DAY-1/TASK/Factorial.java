package day_1;
import java.util.*;
public class Factorial {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	int n=sc.nextInt(),fact=1;
	for(int i=1;i<=n;i++) {
		fact*=i;
	}
    System.out.println("Factorial of the number "+n+" is : "+fact); 
    sc.close();
}

}
