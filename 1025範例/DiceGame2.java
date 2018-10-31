package tw.leonchen.javaproject.flowcontrol.loop;

public class DiceGame2 {

	public static void main(String[] args) {
		int yourLuckyNumber = 3;
		int count = 0;
		int check = 5;

		while (true) {
			int richNum = (int) (Math.random() * 6) + 1;

			//System.out.println("richNum:" + richNum);

			if (yourLuckyNumber == richNum) {
				count++;
				if(count==check) {
					System.out.println("You Win !!");
					break;
				}
				
			} else {
				System.out.println("Do not leave me.");
			}
		}

		System.out.println("finished");
	}

}
