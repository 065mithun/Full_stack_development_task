package day_2;
class Employee{
	//variables
	int Employeeid;
	String EmployeeName;
	float EmployeeSalary;
	
	//constructor
	Employee(int Employeeid,String EmployeeName,float EmployeeSalary){
		this.Employeeid = Employeeid;
		this.EmployeeName = EmployeeName;
		this.EmployeeSalary = EmployeeSalary;
	}
	
	//method
	void display() {
		System.out.println("Employee Id : "+Employeeid);
		System.out.println("Employee Name : "+EmployeeName);
		System.out.println("Employee Salary : "+EmployeeSalary);
	}
}

public class Frist {

	public static void main(String[] args) {
		Employee emp1=new Employee(65, "Mithun" ,50000.0f);
		emp1.display();
		
		Employee emp2=new Employee(66,"Mohan",20000.0f);
		emp2.display();

	}

}
