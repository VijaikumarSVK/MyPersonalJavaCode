package NewYoutubeJavaTraining;

import java.util.Scanner;

public class MultipleMethodPart2 {

	public static void main(String[] args) {

		MultipleMethodPart1 h = new MultipleMethodPart1();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your GF name ");
		String Boyname = sc.nextLine();
		System.out.println("Enter your name");
		String inputname = sc.nextLine();
		
		h.GFname(Boyname,inputname);

}

}
