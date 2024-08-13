package day_2_task;
class Rectangle{
	int width;
	int height;
	
	Rectangle(int width,int height){
		this.width=width;
		this.height=height;
		this.Area(width,height);
	}
	
	public void Area(int width,int height) {
		int Area =width*height;
		System.out.println("Area of the Rectangle : "+Area);
		this.Perimeter(width, height);
	}
	
	public void Perimeter(int width,int height) {
		int Perimeter = (2*width)+(2*height);
		System.out.println("Perimeter of the Rectangle : "+Perimeter);
	}
	
}
public class RecOperation {

	public static void main(String[] args) {
		Rectangle r=new Rectangle(5,5);
		Rectangle r1=new Rectangle(6,7);

	}
}
