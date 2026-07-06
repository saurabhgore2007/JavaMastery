package Day21;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureChain {

	public static void main(String[] args) {

		System.out.println("Main Thread : " + Thread.currentThread().getName());
		
		CompletableFuture<Void> future = CompletableFuture
				
				// Step 1 : Fetch User
				.supplyAsync(() -> {
					
					System.out.println("\nFetching User... (" + Thread.currentThread().getName() + ")");
					sleep(2000);
					return "Amit";
				})
				
				// Step 2 : Process User
				.thenApply(user -> {
					System.out.println("Generating Welcome Message...");
					return "Welcome" + user + " to Spring Boot!";
				})
				
				// Step 3 : Create Welcome Message
				.thenAccept(message -> {
                    System.out.println("\nResult : " + message);
				})
				// Step 4 : Consume Result
				.thenRun(() -> {
                    System.out.println("\nAll Tasks Completed Successfully.");
				});
				

        		System.out.println("\nMain Thread Continues Doing Other Work...\n");

        		future.join();

        		System.out.println("\nProgram Finished.");
	}

	static void sleep(int ms) {
		try {
			Thread.sleep(ms);
		}
		catch(InterruptedException  ex) {
            ex.printStackTrace();
		}
	}
}
