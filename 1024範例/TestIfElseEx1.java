package tw.leonchen.javaproject.flowcontrol;

public class TestIfElseEx1 {

	public static void main(String[] args) {
		int yourLuckyNumber = 5;
		int richNum = (int)(Math.random()*6+1);
		
		System.out.println("richNum:" + richNum);
		
		if(yourLuckyNumber==richNum) {
			System.out.println("You Win !!");
		}else {
			System.out.println("Try Again !!");
		}
		
		System.out.println("finished");
	}

}
