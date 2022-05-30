package hello;

public class objectExample {
	
	int id;
	String name;
	String dept ="IT";
	
	

	
	
	
	public static void main(String[] args) {
		
	objectExample  obj = new objectExample();
	objectExample  obj1 = new objectExample();
	obj.id = 100;
	obj.name = "ram";
	 
	obj.id = 109;
	obj.name ="raj";
	 System.out.println(obj.id+" "+obj.name+" "+obj.dept);
	 System.out.println(obj.id+" "+obj1.name+" "+obj.dept);

			

	

	
	
	}
	
	
	
	
	
	

}
