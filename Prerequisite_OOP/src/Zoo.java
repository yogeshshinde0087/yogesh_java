
public class Zoo {
	String typeofanimal;
	String name;
	int age;
	int weight;
	String colour;
	
	
	
	
   public Zoo(String typeofanimal, String name, int age, int weight, String colour) {
		super();
		this.typeofanimal = typeofanimal;
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.colour = colour;
	    }




       public void speak() {
	   
	   System.out.println("Hello, I am "+ typeofanimal);
	   System.out.println("My name is "+ name);
	   System.out.println("I am "+ age + " years old");
	   System.out.println("My weight is "+ weight + " Inlbs");
	   System.out.println("My colour is "+ colour);
       }

       public void eat() {
	
	   System.out.println("Eating");
	   }
       
       public void sleep() {
    	
    	System.out.println("sleeping");   
       }
} 
