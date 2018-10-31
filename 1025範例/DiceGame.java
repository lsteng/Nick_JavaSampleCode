package tw.leonchen.javaproject.flowcontrol.loop;

public class DiceGame {

	public static void main(String[] args) {
		int yourLuckyNumber = 6;

		while (true) {
			int richNum = (int) (Math.random() * 6) + 1;

			System.out.println("richNum:" + richNum);

			if (yourLuckyNumber == richNum) {
				System.out.println("You Win !!");
				break;
			} else {
				System.out.println("Do not leave me.");
			}
		}

		System.out.println("finished");
	}

}
