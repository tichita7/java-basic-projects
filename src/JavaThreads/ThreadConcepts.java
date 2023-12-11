package JavaThreads;

class Parent{
	public void m1() {
		System.out.println("This is m1 method");
	}
}
class T1 extends Thread{
	public void run() {
		System.out.println("By thread class");
	}
}
class T2 extends Parent implements Runnable{
	public void run() {
		m1();
		System.out.println("By using runnable interface");
	}
}
public class ThreadConcepts {

	public static void main(String[] args) {
		T1 t1 = new T1();
		t1.start();
		
		T2 t2 = new T2();
		Thread trd = new Thread(t2);
		trd.start();
	}
}
