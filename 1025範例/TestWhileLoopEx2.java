package tw.leonchen.javaproject.flowcontrol.loop;

public class TestWhileLoopEx2 {

	public static void main(String[] args) {
		long sum=0;
		int i=1;
		
		while(i<=10) {			
			sum = sum+i;  //sum+=i;
			System.out.println("i=" + i + " total:" + sum);
			i++;			
		}
		
		System.out.println("sum=" + sum);

	}

}
