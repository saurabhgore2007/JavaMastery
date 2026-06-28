package Day16;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableEx1 {

	public static void main(String[] args) {

		ExecutorService service = Executors.newSingleThreadExecutor();
		
		Callable<Integer> task = () ->{
			StringBuilder sb = new StringBuilder("Calculating");
			for(int i = 0;i<3;i++) {
				Thread.sleep(400);
				sb.append(".");
				System.out.println(sb);
			}
			return 10 + 20;
		};
		
		Future<Integer> future = service.submit(task);

		try {
			Integer result = future.get();
			System.out.println("Result is " + result);
		}
		catch(ExecutionException | InterruptedException ex) {
			ex.printStackTrace();
		}
		finally {
			service.shutdown();
		}
		
	}

}
