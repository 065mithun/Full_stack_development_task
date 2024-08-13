package day_2;

public class CO {

	CO(String name) {
    	System.out.println("Welcome "+name);
    }
    CO(int a,int b) {
    	this("Mithun");
    	System.out.println("Addition : "+(a+b));
    }
    CO(int n) {
    	this(20,400);
    	System.out.println("Sqaure : "+(n*n));
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        CO o1=new CO(13);
       
	}

}
