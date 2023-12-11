package JavaThreads;

//class Sheet{
//	public synchronized void writeln(int k) {
//		for(int i=1;i<=5;i++) {
//			System.out.println(i*k);
//		}
//	}
//}

class Sheet{
	public void writeln(int k) {
		synchronized (this){
			for(int i=1;i<=5;i++) {
				System.out.println("Sync " + (i+k));
			}
		}
		for(int i=1;i<=5;i++) {
			System.out.println(i*k);
		}
	}
}
class Person1 extends Thread{
	Sheet st;
	public Person1(Sheet st) {
		super();
		this.st = st;
	}
	public void run() {
		st.writeln(5);
	}
}
class Person2 extends Thread{
	Sheet st;
	public Person2(Sheet st) {
		super();
		this.st = st;
	}
	public void run() {
		st.writeln(10);
	}
}
public class SynchronizationConcepts {
	public static void main(String[] args) {
		Sheet st = new Sheet();
		
		Person1 p1 = new Person1(st);
		Person2 p2 = new Person2(st);
		
		p1.start();
		p2.start();
	}
}
