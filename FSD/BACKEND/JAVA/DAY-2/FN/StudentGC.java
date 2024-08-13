package day_2;
import java.util.*;
class Student{
	int regno;
	String Studentname;
	int marks[]=new int[5];
	int sum;
	int average;
	String grade;
	Student(int regno,String Studentname) {
		this.regno=regno;
		this.Studentname=Studentname;
	}
	
	void getMarks(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Marks:");
		for(int i=0;i<this.marks.length;i++) {
			this.marks[i]=sc.nextInt();
		}
		this.CalculateGrade();
	}
	void CalculateGrade() {
		for(int i=0;i<this.marks.length;i++) {
			sum+=this.marks[i];
		}
		int len=this.marks.length;
		average=sum/len;
		if(average>90) {
			grade="A";
		}
		else  if(average>70){
			grade="B";
		}
		else if(average>=50) {
			grade="C";
		}
		else {
			grade="F";
		}
	}
	
	void display() {
		System.out.println("Register Number : "+this.regno);
		System.out.println("Student Name : "+this.Studentname);
		System.out.println("Total no of marks : "+this.sum);
		System.out.println("Average of the all marks : "+this.average);
		System.out.println("Grade for the marks : "+this.grade);
	}
	
}
public class StudentGC {

	public static void main(String[] args) {
	Student s=new Student(65,"Mithun");	
	s.getMarks();
    s.display();
	}

}
