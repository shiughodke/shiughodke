package threading;

public class UseThreadClass extends Thread {
	public void run() {
		System.out.println("I am thread");
	}
	public static void main(String[] args) {
		 UseThreadClass u = new  UseThreadClass();
		 u.start();
	}
	

}
