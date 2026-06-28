package Day16;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class ExecuterServiceEx1 {

	public static void main(String[] args) {

		ExecutorService service = Executors.newFixedThreadPool(2);
		
		Runnable task = () ->{
			System.out.println(Thread.currentThread().getName() + " is Working");
		};
		
        for(int i=1;i<=5;i++) {

        	service.execute(task);
        }
        
        service.shutdown();
	}

}
