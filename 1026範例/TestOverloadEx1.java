package tw.leonchen.javaproject.oop.overload;

public class TestOverloadEx1 {

	public void add(int x, int y) {
		System.out.println("x+y=" + (x+y));
	}
	
	public void add(double a, double b) {
		System.out.println("a+b=" + (a+b));
	}
	
	public static void main(String[] args) {
		TestOverloadEx1 overload1 = new TestOverloadEx1();
		overload1.add(1, 3);
		overload1.add(3.14, 5);
		overload1.add('a', 3.14F);
	}

}
