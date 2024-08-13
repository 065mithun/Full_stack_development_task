package day_2;

public class ThisKeword {
    String name;
    ThisKeword(String name){
    	this(10,20);
    	this.name=name;
    	this.display();
    }
    ThisKeword(int a,int b){
    	System.out.println("Addition : "+(a+b));
    }
    void display() {
    	System.out.println("Welcome "+this.name);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ThisKeword tk=new ThisKeword("Mithun");
	}

}
