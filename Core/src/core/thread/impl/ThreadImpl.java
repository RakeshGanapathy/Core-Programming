package core.thread.impl;

public class ThreadImpl implements Runnable {
public void run() {
	for(int i =0;i<=5;i++) {
		Thread currentthread= Thread.currentThread();
		System.out.println(currentthread.getName());
		System.out.println(currentthread.getPriority());
		try {
			Thread.sleep(5000);
			System.out.println(currentthread.getName()+" am live ");
		}
		catch (InterruptedException e){
			e.printStackTrace();
		}
	}
}
	public static void main(String[] args) {
		ThreadImpl threadObj = new ThreadImpl();
		Thread th= new Thread(threadObj);
		th.setName("Jspiders");
		th.setPriority(Thread.MAX_PRIORITY);
		th.start();
		ThreadImpl threadObj2=new ThreadImpl();
		Thread th2= new Thread(threadObj2);
		th2.setName("Qspiders");
		th2.setPriority(Thread.MIN_PRIORITY);
		th2.start();
		ThreadImpl threadObj3=new ThreadImpl();
		Thread th3= new Thread(threadObj3);
		th3.setName("Pyspiders");
		th3.setPriority(Thread.NORM_PRIORITY);
		th3.start();
		
	}

}
