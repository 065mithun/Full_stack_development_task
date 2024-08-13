package day_2_task;
class Circle{
	double radius;
	double Area;
	double Circumference;
	
	Circle(double radius){
		this.radius=radius;
	}
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius=radius;
	}
	public double Area() {
		return Math.PI*radius*radius;
	}
	public double Circumference() {
		return 2*Math.PI*radius;
	}
	void display() {
		System.out.println("Radius of the Circle : "+radius);
		System.out.println("Area of the Circle : "+Area());
		System.out.println("Circumference of the Circle : "+Circumference());
	}
}
public class CirOperation {

	public static void main(String[] args) {
		Circle c=new Circle(6.0);
		System.out.println("Normal Intilization....");
		c.display();
		
		c.setRadius(7.5);
		System.out.println("Update Intilization.....");
		c.display();

	}

}
