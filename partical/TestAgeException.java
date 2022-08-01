package New;

public class TestAgeException {
	
	public void checkAge(int age) throws AgeException{
		if(age<18) {
			throw new AgeException("you are not eligible");
		}
		else {
			System.out.println("you are eligible");
		}
	}

	public static void main(String[] args) {
		TestAgeException t = new TestAgeException();
		try
		{
		t.checkAge(17);
		}catch (AgeException e) {
			System.out.println(e);
			
		
			
		}
		
	}

}
