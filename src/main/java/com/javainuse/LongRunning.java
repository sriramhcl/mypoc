package com.javainuse;

public class LongRunning extends Thread{

public void run(){

	try {
	System.out.println("thread is running...");
	Thread.sleep(300000);
	System.out.println("thread has completed sleep...");

	      }catch (InterruptedException e) {
	         System.out.println("Thread  interrupted.");
      }



}

}