package tw.leonchen.javaproject.flowcontrol;

public class TestNestedIfEx1 {

	public static void main(String[] args) {
		int value = 0;
		
		if(value>=0) {
			System.out.println(value + " is positive.");
			
			if((value%2)==0) {
				System.out.println(value + " is even.");
			}else {
				System.out.println(value + " is odd.");
			}
		}else {
			System.out.println(value + " is negative.");
			
			if((value%2)==0) {
				System.out.println(value + " is even.");
			}else {
				System.out.println(value + " is odd.");
			}
		}

		System.out.println("finished");
	}

}
