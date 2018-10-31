package tw.leonchen.javaproject.flowcontrol.loop;

public class TestBreakNContinueLabelEx1 {

	public static void main(String[] args) {
		dingo:
		  for(int i=1;i<=3;i++) {
			  for(int j=1;j<=5;j++) {
				  if(i==2 && j==3) {
					  //break dingo;
					  continue dingo;
				  }
				  System.out.printf("i=%d j=%d\n", i, j);
			  }
		  }
	
	      System.out.println("finished");

	}

}
