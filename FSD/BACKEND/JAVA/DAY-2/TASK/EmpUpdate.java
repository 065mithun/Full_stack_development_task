package day_2_task;
class Employee{
	
	String Name;
	String Title;
	double Salary;
	
	Employee(String Name,String Title,double Salary){
		this.Name=Name;
		this.Title=Title;
		this.Salary=Salary;
	} 
	
	public void setName(String Name) {
		this.Name=Name;
	}
	public void setTitle(String Title) {
		this.Title=Title;
	}
	public void setSalary(double Salary) {
		if(Salary<0) {
			System.out.println("Salary must be Positive");
		}
		else {
			this.Salary=Salary;
		}
	}
	void display() {
		System.out.println("Employee Name : "+Name);
		System.out.println("Employee Job Title : "+Title);
		System.out.println("Employee Salary : "+Salary);
	}
	
}
public class EmpUpdate {

	public static void main(String[] args) {
		Employee e=new Employee("Mithun","Full-Stack Developer",75000.0);
		System.out.println("Normal Employee Details...");
		e.display();
		
		e.setName("Mithun Kumar");
		e.setTitle("Web Developer");
		e.setSalary(100000.0);
		System.out.println("Updated Employee Details.....");
		e.display();

	}

}
