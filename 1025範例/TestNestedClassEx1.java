package tw.leonchen.javaproject.flowcontrol.loop;

public class TestNestedClassEx1 {

	public static void main(String[] args) {
		int j = 1;
		while (j <= 3) {

			int i = 1;
			while (i <= 10) {
				System.out.print("@");
				i++;
			}
			
			//System.out.println();
			System.out.print("\n");
			
			j++;
		}

	}

}
