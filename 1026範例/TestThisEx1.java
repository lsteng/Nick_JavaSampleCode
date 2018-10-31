package tw.leonchen.javaproject.oop;

public class TestThisEx1 {

	int x = 2;
	int y = 3;
	
	public void action(int x, int y) {
		this.x = x;
		this.y = y;
		
		System.out.println("this:" + this);
	}
	
	public static void main(String[] args) {
		TestThisEx1 process = new TestThisEx1();
		System.out.println("process:" + process);
		process.action(3, 5);
		
		System.out.println("process.x:" + process.x);
		System.out.println("process.y:" + process.y);
		
	}

}
