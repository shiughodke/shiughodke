package Lab;

public interface LibraryUser {

  class kidUser implements LibraryUser{
	 private int age;
	  private String bookType;
	  
	  public void setAge(int age) {
		  this.age = age;
	  }
    public void bookType(String bookType) {
    	this.bookType = bookType;
    	
    }
	public  void  registerAccount() {
		if(age<12)
			System.out.println("you have successful registered under a kids account");
		else
			System.out.println("Sorry, Age must be less than 12 to register as a kid");
	}
    public  void requestBook() {
    if(bookType.equals("kids"))
      System.out.println("Book Issued successfully, please return the book within 10 days");
    else
    	System.out.println("Oops, you are allowed to take only kids books” should be displayed in the console");
    }
  }
}
class AdultUser implements LibraryUser{
	 private int age;
	  private String bookType;
	  
	  public void setAge(int age) {
		  this.age = age;
	  }
  public void bookType(String bookType) {
  	this.bookType = bookType;
  	
  }
	public  void  registerAccount() {
		if(age>12)
			System.out.println("you have successful registered under a kids account");
		else
			System.out.println("Sorry, Age must be less than 12 to register as a kid");
	}
  public  void requestBook() {
  if(bookType.equals("kids"))
    System.out.println("Book Issued successfully, please return the book within 10 days");
  else
  	System.out.println("Oops, you are allowed to take only kids books” should be displayed in the console");
  }

 public static void main(String[] args) {
	 kidUser  kidUser = new kidUser();
	 kidUser.setAge(10);
	 kidUser.bookType("kids");
	 kidUser.registerAccount();
	 kidUser.requestBook();
	 
	 kidUser.setAge(18);
	 kidUser.bookType("Frction");
	 kidUser.registerAccount();
	 kidUser.requestBook();
	 System.out.println();
	 
	 AdultUser AdultUser = new  AdultUser();
	 AdultUser.setAge(5);
	 AdultUser.bookType("kids");
	 AdultUser.registerAccount();
	 AdultUser.requestBook();
	 System.out.println();
	 
 }
	
	
	
}

	



	
	 



