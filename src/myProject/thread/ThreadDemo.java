package myProject.thread;

public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {
//		MyThread myThread = new MyThread();
////		myThread.run(); //нет параллельности потока
//		myThread.start();
//		
//		MyThread1 myThread1 = new MyThread1();
//		myThread1.start();
//		
//		MyThread1 myThread2 = new MyThread1();
//		myThread2.start();
//		
//		System.out.println("Going to sleep");
//		
//		Thread.sleep(3000);
//		
//		System.out.println("Hello from main");
		
		Thread thread = new Thread(new Runner());
		thread.start();

	}
	
}
	
	class MyThread extends Thread {
		@Override
		public void run() {
			for (int i = 0; i < 10; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.print("Hello MF1 ");
			}
			
		}
	}
	
	class MyThread1 extends Thread {
		@Override
		public void run() {
			for (int i = 0; i < 10; i++) {
				System.out.print(" Hello MF2 " + i);
			}
			
		}
	}
	
	class Runner implements Runnable {

		@Override
		public void run() {
			for (int i = 0; i < 10; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.print("Hello MF1 ");
			}
		}
		
	}


