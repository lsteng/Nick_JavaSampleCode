package tw.leonchen.javaproject.oop;

public class TestConstructorEx1 {

	//constructor
	public TestConstructorEx1(int index) {  
		System.out.println("i am contructor." + index);
	}
	
	//method: entry point
	public static void main(String[] args) {		
		TestConstructorEx1 test1 = new TestConstructorEx1(7);
		test1.show();
		//test1.show();
		
		//anonymous object
		new TestConstructorEx1(9).show();
		//new TestConstructorEx1(5).show();
		
//		int i=1;
//		i=i+1;
//		System.out.println("i=" + i);
//		System.out.println("1+1=" + (1+1));
		
		
		System.out.println("finished");
	}
	
	//method
	public void show() {  
		System.out.println("Show Something.");
	}

}
