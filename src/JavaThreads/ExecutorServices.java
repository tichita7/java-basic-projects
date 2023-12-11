package JavaThreads;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;



class Card extends Thread{
	public void run() {
		System.out.println("Thread Name:- " + Thread.currentThread().getName());
	}
}
public class ExecutorServices {
	public static void main(String[] args) {
		
		//Fixed thread
		ExecutorService execute = Executors.newFixedThreadPool(4);
		for(int i=0;i<=10;i++) {
			execute.execute(new Card());
		}
		
		//Cached thread
		ExecutorService executor = Executors.newCachedThreadPool();
		for(int i=0;i<=10;i++) {
			executor.execute(new Card());
		}
		
		
		//Scheduled Thread
		ScheduledExecutorService executors = Executors.newScheduledThreadPool(3);
		executors.schedule(new Card(), 3, TimeUnit.SECONDS);
		executors.scheduleAtFixedRate(new Card(), 10, 2, TimeUnit.SECONDS);
		executors.scheduleWithFixedDelay(new Card(), 5, 2, TimeUnit.SECONDS);
		
		
		//Single Thread
		ScheduledExecutorService executorer = Executors.newScheduledThreadPool(3);
		executorer.scheduleWithFixedDelay(new Card(), 5, 2, TimeUnit.SECONDS);
		}
}
	


