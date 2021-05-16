package core.thread.impl;

public class ThreadCreation extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName());
			System.out.println(Thread.currentThread().getPriority());
		}
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"am awake");
	}

	public static void main(String[] args) {
		ThreadCreation th  = new ThreadCreation();
		th.setPriority(MAX_PRIORITY);
		th.start();
		ThreadCreation th2  = new ThreadCreation();
		th2.start();
		th2.setName("QSP");
	}

}
