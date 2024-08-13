package day_2_task;
class Person{
	String Name;
	int Age;
	
	Person(String Name,int Age){
		this.Name=Name;
		this.Age=Age;
	}
	
	void display() {
		System.out.println("Person Details....");
		System.out.println("Person Name : "+this.Name);
		System.out.println("Person Age : "+this.Age);
	}
}
public class PersonDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Person p=new Person("Mithun",21);
        p.display();
        Person p1=new Person("Mohan",21);
        p1.display();
	}

}
