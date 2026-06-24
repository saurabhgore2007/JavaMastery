package Day15;

class MyThread extends Thread{
	
	@Override
	public void run() {
        System.out.println("My Thread is Running...");
	}
}

public class ThreadEx2 {

	public static void main(String[] args) {

		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		
		t1.start();
		t2.start();
        System.out.println("Main Thread");

		
	}
}
