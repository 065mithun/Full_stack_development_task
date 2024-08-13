package day_1;
import java.util.*;
public class RandomNumber {
public static void main(String[] args) {
//    Scanner sc=new Scanner(System.in);
    Random r=new Random();
    int s=r.nextInt(100);
    System.out.println(s);
    float st=r.nextFloat(100);
    System.out.println(st);
}
}
