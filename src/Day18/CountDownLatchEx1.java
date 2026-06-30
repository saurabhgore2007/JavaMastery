package Day18;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchEx1 {

	public static void main(String[] args) throws Exception{

		CountDownLatch latch = new CountDownLatch(3);
		
		ExecutorService service = Executors.newFixedThreadPool(3);
		
		for(int i = 1; i <= 5; i++) {

            int id = i;
            
            service.submit(() -> {
                System.out.println("Task " + id + " started");

                Thread.sleep(3000);
                System.out.println("Task " + id + " finished");
                
                latch.countDown();
                
                return null;

            });   
		}
		System.out.println("Main waiting...");

        latch.await();

        System.out.println("All tasks completed!");

        service.shutdown();
	}

}
