package JavaThreads;

public class DeadlockConcept {

	public static Object Lock1 = new Object();
	public static Object Lock2 = new Object();
	
	public static void main(String[] args) {
		LockThread l1 = new LockThread();
		System.out.println(l1);
	}
	
	public static class LockThread extends Thread {
		public void run() {
			synchronized(Lock1){
				System.out.println("Thread one hold lock 1");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			
				System.out.println("Thread one is waiting for lock 2");
//				try {
//					Thread.sleep(100);
//				} catch (InterruptedException e) {
//					// TODO: handle exception
//					e.printStackTrace();
//				}
     		}
			synchronized(Lock2) {
				System.out.println("Thread one hold lock 2");
			}
		}
	}
}
