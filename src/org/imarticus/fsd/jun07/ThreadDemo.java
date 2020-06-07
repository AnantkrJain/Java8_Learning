package org.imarticus.fsd.jun07;

public class ThreadDemo extends Thread {
	public void printNumbers() {
		for(int i=1; i<=10; i++) {
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
		ThreadDemo obj1 = new ThreadDemo();
		ThreadDemo obj2 = new ThreadDemo();
		ThreadDemo obj3 = new ThreadDemo();
		System.out.println("MultiThreading");
		obj1.start();
		obj2.start();
		obj3.start();
		
		System.out.println(obj1.getPriority());
		obj1.setPriority(3);
		System.out.println(obj1.getPriority());
		
		System.out.println(obj2.getName());
		obj2.setName("Thread Two");
		System.out.println(obj2.getName());
		
		System.out.println("Normal Execution");
		obj1.printNumbers();
		obj2.printNumbers();
		obj3.printNumbers();
		
	}
}
