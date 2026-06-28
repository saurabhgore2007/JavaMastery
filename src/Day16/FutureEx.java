package Day16;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureEx {

	public static void main(String[] args) throws Exception{

		ExecutorService service = Executors.newSingleThreadExecutor();

		Callable<Integer> task = () -> {

		    Thread.sleep(3000);

		    return 50;

		};
		
			Future<Integer> future = service.submit(task);

//			future.cancel(true);
			while(!future.isDone()) {
			System.out.println("Still Working...");
			Thread.sleep(500);

			}
			System.out.println(future.get());
			System.out.println(future.isCancelled());
			service.shutdown();
		
	}

}
