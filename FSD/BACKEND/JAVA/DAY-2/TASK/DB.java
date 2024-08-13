package day_2_task;
class Dog{
	String Name;
	String Breed;
	
	Dog(String Name,String Breed){
		this.Name=Name;
		this.Breed=Breed;
	}
	
	public void setName(String Name) {
		this.Name=Name;
	}
	public void setBreed(String Breed) {
	   this.Breed=Breed;
	}
	public void Display() {
        System.out.println("Name: " + Name + ", Breed: " + Breed);
    }
}
public class DB {

	public static void main(String[] args) {
		 Dog d1 = new Dog("Buddy", "Golden Retriever");
	        Dog d2 = new Dog("Max", "Beagle");
	        System.out.println("Initial details of dog1:");
	        d1.Display();
	        System.out.println("Initial details of dog2:");
	        d2.Display();

	    
	        d1.setName("Charlie");
	        d1.setBreed("Labrador");
	        d2.setName("Rocky");
	        d2.setBreed("Bulldog");
	        System.out.println("\nUpdated details of dog1:");
	        d1.Display();
	        System.out.println("Updated details of dog2:");
	        d2.Display();

	}

}
