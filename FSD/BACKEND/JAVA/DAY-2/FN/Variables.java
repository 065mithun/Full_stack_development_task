package day_2;

public class Variables {
    int b=20; //Instances or Object variable
    
    static int c=30; //Static or Class variable
    
	public static void main(String[] args) {
		int a=10; //Local variable
		System.out.println("Local Variable : "+a);
        Variables v=new Variables();
		System.out.println("Instances variable: "+v.b);
		
		System.out.println("Static variable : "+c);
		
	}

}
