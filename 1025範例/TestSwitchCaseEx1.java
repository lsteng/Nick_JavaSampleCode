package tw.leonchen.javaproject.flowcontrol;

public class TestSwitchCaseEx1 {

	public static void main(String[] args) {
		int level = 20;
		
		switch(level) {
		   case 5:
			   System.out.println("stick");
			   break;
		   case 10:
			   System.out.println("knife");
			   break;
		   case 20:
			   System.out.println("pistal");
			   break;
		   case 35:
			   System.out.println("rifle");
			   break;
		   case 50:
			   System.out.println("Machine Gun");
			   break;
		   default:
			   System.out.println("your hands");
			   //break;
		}
		
		System.out.println("Ready.");

	}

}
