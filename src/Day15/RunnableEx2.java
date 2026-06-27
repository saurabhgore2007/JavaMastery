package Day15;

//sleep(ms)

class MyThreads extends Thread {

    public void run() {

        for(int i=1;i<=3;i++) {

            System.out.println("Child : " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
        }
    }
}

public class RunnableEx2 {

	public static void main(String[] args) throws InterruptedException {

		MyThreads t = new MyThreads();
        System.out.println(t.isAlive());

        t.start();
        //isAlive()
        System.out.println(t.isAlive());
        //join()
        t.join();
        Thread.yield();
        for(int i=1;i<=3;i++) {

            System.out.println("Main : " + i);
        }
        System.out.println(t.isAlive());
    }
	
}
