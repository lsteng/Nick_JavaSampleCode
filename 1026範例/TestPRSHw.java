package tw.leonchen.javaproject.lab;

public class TestPRSHw {

	public static void main(String[] args) {
		while (true) {
			int A = (int) (Math.random() * 3 + 1);
			int B = (int) (Math.random() * 3 + 1);

			System.out.println("A:" + A + " B:" + B);

			if ((A == 1 && B == 3) || (A == 2 && B == 1) || (A == 3 && B == 2)) {
				System.out.println("A Win");
				break;
			} else if ((A == 3 && B == 1) || (A == 1 && B == 2) || (A == 2 && B == 3)) {
				System.out.println("B Win");
				break;
			} else if ((A == 1 && B == 1) || (A == 2 && B == 2) || (A == 3 && B == 3)) {
				System.out.println("Draw");
			}

		}
	}

}
