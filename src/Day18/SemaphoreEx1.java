package Day18;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class SemaphoreEx1 {

	public static void main(String[] args) {

		Semaphore semaphore = new Semaphore(2,true);
		
        ExecutorService service = Executors.newFixedThreadPool(5);

        for(int i = 1; i<=5;i++) {
        	
        	int id = i;
        	
        	service.submit(() -> {
        		try {
        			semaphore.acquire();
        			System.out.println("Task " + id + " entered");

                    Thread.sleep(2000);

                    System.out.println("Task " + id + " leaving");
        		}
        		catch(InterruptedException e){
        			Thread.currentThread().interrupt();
        		}
        		finally {
                    semaphore.release();
                }
        	});
        }
        
        service.shutdown();
	}

}
