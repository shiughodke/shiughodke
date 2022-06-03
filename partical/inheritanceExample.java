package hello;
// super class

class animal{
	String food;
	String colour;
	String place;
	String type;
	String name;
	
	public void eat() {
		System.out.println("i am eating/.......");
	}
	
}
//subclass inherit from animal
    class dogs extends animal{
    	String bread = "labrador"; // child class property
    	
    	// new method in child class 
    	void display() {

    		System.out.println("food is : "+food);
    		System.out.println("colour is : "+colour);
    		System.out.println("place is : "+place);
    		System.out.println("type is : "+type);
    		System.out.println("name is : "+name);
    		
    	}
    }class inheritanceExample {

	public static void main(String[] args) {
		dogs d = new dogs(); // creating object
		d.food = "milk";   // accees filed of subclass
		d.colour = " white";
		d.place = "doghouse";
		d.type = "pet";
		d.name = "sheru";
		
		d.display(); // calling subclass method
		d.eat(); // calling superclass method
		 

	}

}
