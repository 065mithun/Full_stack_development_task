package day_2;

public class Methods {
    
	void Mymethod1() {
		System.out.println("Instances Method");
	}
	static void Mymethod2() {
		System.out.println("Static Method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Methods m = new Methods();
        m.Mymethod1();
        
        Methods.Mymethod2();
        
	}

}
