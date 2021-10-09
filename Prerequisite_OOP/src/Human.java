
public class Human {
	
	String name;
	int age;
	int heightininches;
	String eyecolour;
	
   
	
	public Human(String name, int age, int heightininches, String eyecolour) {
		super();
		this.name = name;
		this.age = age;
		this.heightininches = heightininches;
		this.eyecolour = eyecolour;
	}

	public void speak () { 
		 
		System.out.println("Hello, My name is " + name);
		
		System.out.println("I am "+ age + " years old");
		
		System.out.println("My height in inches " + heightininches);
		
		System.out.println("My eye colour is " + eyecolour);
		
	} 
	
	public void eat () {
		
		System.out.println("eating..");
	}
	
	public void walk () {
	
	    System.out.println("walking..");

}  
	public void work () {
		System.out.println("working ..");
	}
}
