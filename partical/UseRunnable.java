package threading;

public class UseRunnable implements Runnable {
	@Override
	public void run() {
    System.out.println("I am Runnable");		
	}

	public static void main(String[] args) {
		UseRunnable u = new UseRunnable ();
		Thread t = new Thread(u);
		t.run();
	}

	
	}


