package org.imarticus.fsd.jun07;

public class ThreadJoinDemo extends Thread {
	public void printNumbers() {
		for(int i=1; i<=5; i++) {
			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		//printNumbers();
	}
	
	public static void main(String[] args) {
		ThreadJoinDemo obj1 = new ThreadJoinDemo();
		ThreadJoinDemo obj2 = new ThreadJoinDemo();
		ThreadJoinDemo obj3 = new ThreadJoinDemo();
		System.out.println("MultiThreading");
		obj1.start();
		try {
			obj1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		obj2.start();
		obj3.start();
	}
}
