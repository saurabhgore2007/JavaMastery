package Day21;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureEx {

	public static void main(String[] args) throws Exception{

		//thenApply()
		CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> "Amazon")
				.thenApply(String::toUpperCase).thenApply(s -> s + " Services");
		System.out.println(future.get());
		
		//supplyAsync()
		CompletableFuture<String> product = CompletableFuture.supplyAsync(() -> {
			sleep(2000);
			return "Laptop";
		});
		
		CompletableFuture<String> reviews = CompletableFuture.supplyAsync(() -> {
			sleep(2000);
			return "★★★★★";
		});
		
		CompletableFuture<String> recommendation  = CompletableFuture.supplyAsync(() -> {
			sleep(2000);
			return "Mouse";
		});
		
		System.out.println(product.join());

        System.out.println(reviews.join());

        System.out.println(recommendation.join());
        
        //thenAccept()
        CompletableFuture.supplyAsync(() -> "Happy Shopping").thenAccept(System.out::println);
        
        //thenRun()
        CompletableFuture.supplyAsync(() -> "Done").thenRun(() -> {

		    System.out.println("Finished Successfully");
		});
        
	}

	static void sleep(int ms) {
		try{

            Thread.sleep(ms);

        }catch(Exception e){}
	}
}
