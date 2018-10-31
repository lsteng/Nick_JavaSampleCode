package tw.leonchen.javaproject.oop;

class MyParam{
	
	static int grade;
	
	public static void showMsg() {
		System.out.println("Keep Secret.");
	}
}

public class CallTestStaticMembersEx1 {

	public static void main(String[] args) {
		MyParam.showMsg();
		System.out.println("MyParam.grad:" + MyParam.grade);
		
		//MyParam.grade = 18;
		
		//MyParam test1 = new MyParam();
		//System.out.println("test1.grade:" + test1.grade);
	}

}
