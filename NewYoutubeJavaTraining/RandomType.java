package NewYoutubeJavaTraining;

import java.util.Random;

public class RandomType {
	
	public static void main(String args[]) {

		Random ra = new Random();

		int j;

		for (int i = 0; i <= 10; i++) {
			
			j = 1 + ra.nextInt(6);
			System.out.println(j);
		}
	}

}
