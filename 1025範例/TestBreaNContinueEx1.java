package tw.leonchen.javaproject.flowcontrol.loop;

public class TestBreaNContinueEx1 {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			
			if(i==5) {
				//break;
				continue;
			}
			
			System.out.println("i=" + i);
		}
		
		System.out.println("finished");
	}

}
