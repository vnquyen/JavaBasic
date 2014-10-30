package edu.java.basic;

public class ThreadDemo {

	public static void main(String[] args) {
		Thread thread = new Thread() {
			public void run() {
				try {
					System.out.println("Pause");
					Thread.sleep(3000);
					System.out.println("Restart");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		//thread.start();
		//You can't call thread.start() more than 1 time
		//thread.start();
		
		//But you can call thread.run() many times you want
		//thread.run();
		//thread.run();
		
		//MyThread myThread = new MyThread();
		//myThread.start();
		
		MySecondThread mySecondThread = new MySecondThread();
		Thread thread1 = new Thread(mySecondThread);
		Thread thread2 = new Thread(mySecondThread);
		
		thread1.setName("Mew");
		thread2.setName("Mewtwo");
		
		thread1.start();
		thread2.start();
	}

}

class MyThread extends Thread {
	public void run() {
		for(int i = 0; i < 10; i++) {
			try {
				System.out.println("Pause: " + i);
				Thread.sleep(500);
				System.out.println("Restart: " + i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}


class MySecondThread implements Runnable {
	private int hp = 100;
	
	@Override
	public synchronized void run() {
		for(int i = 0; i < 10; i++) {
			try {
				System.out.println("Second Pause: " + Thread.currentThread().getName() + " " + hp--);
				Thread.sleep(10);
				System.out.println("Second Restart: " + Thread.currentThread().getName() + " " + hp--);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public void start() {
		run();
	};
	
}