package com.mla;
import java.util.concurrent.*;
class Impl implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("The run() is triggered from another mehtod");
	}
	
}
public class Excutttor {

	
	static ExecutorService exec = Executors.newFixedThreadPool(1) ;
	
	public static void main(String[] sri) {
		Runnable task = new Impl();
		Thread t1 = new Thread(task);
		 	t1.start();
		Thread t2 = new Thread(task);
		 	t2.start();
		 	 exec.submit(task);
		 	 exec.shutdown();
		
		Collection
		 
	}
}
