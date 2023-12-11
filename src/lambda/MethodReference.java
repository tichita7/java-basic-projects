package lambda;

interface Sayable{
	void say();
}
interface GetInfo{
	Info getMsg(String str);
}
class Info{
	Info(String msg){
		System.out.println(msg);
	}
}
public class MethodReference {
	public void hello() {
		System.out.println("Hieeeeeee");
	}

	public static void saySomething() {
		System.out.println("Hello, this is static method");
	}
	public static void processingSomething() {
		System.out.println("processing....");
	}
	public static void main(String[] args) {
		//class
		GetInfo info = Info::new;
		info.getMsg("Sneha's message");
		
		MethodReference mt = new MethodReference();
		Sayable isv = mt::hello;
		isv.say();
		
		//referring static method
		Sayable sayable = MethodReference:: saySomething;
		//calling interface
		sayable.say();
		
		
		//thread
		Thread t1 = new Thread(MethodReference:: processingSomething);
		//calling thread
		t1.start();
	}
}
