package day_2;

public class Overloading {
    void method(String name) {
    	System.out.println("Welcome "+name);
    }
    void method(int a,int b) {
    	System.out.println("Addition : "+(a+b));
    }
    void method(int n) {
    	System.out.println("Sqaure : "+(n*n));
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Overloading o=new Overloading();
        o.method("Mithun");
        o.method(20,400);
        o.method(13);
	}

}
