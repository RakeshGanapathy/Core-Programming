package core.thread.impl;

public class Synchronization implements Runnable{
	static int k=0;
	@Override
	public synchronized void run() {
		for(int i=0;i<=100;i++) {
			k++;
			k--;
		}
	}

	public static void main(String[] args) {
		Synchronization sync = new Synchronization();
		Thread[] th = new Thread[100];
		for(int i=0;i<th.length;i++) {
			th[i]=new Thread(sync);
			th[i].start();
		}
		System.out.println(k);
	}
}
