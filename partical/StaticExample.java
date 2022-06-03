   package hello;

    public class StaticExample {
// instance variable
	int empid;
    String  empName;
    static String  empOfflocation="pune";
     
    //parameterized constructor
    public StaticExample(int i, String n) {
    	this.empid=i;
    	this.empName=n;
    }
    
    			
       //method  to display value
    void display() {
    	System.out.println(empid+ " "+empName+" "+empOfflocation);
    }
    
     public static void main(String[] args) {   

    	 StaticExample s = new StaticExample(122,"raj");
    	 StaticExample s1 = new StaticExample(123,"shubham");
    	 
    	 s.display();
    	 s1.display();
    	 
		
		

	}

}
