package tw.leonchen.javaproject.oop.method;

public class CallTestMethodEx3 {

	public int f(int x) {
		int result = 2*x+1;
		return result;
	}
	
	public static void main(String[] args) {
		CallTestMethodEx3 test1 = new CallTestMethodEx3();
		int y = test1.f(5);
		System.out.println("y=" + y);
	}

}
