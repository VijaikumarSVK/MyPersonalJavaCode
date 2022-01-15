package NewYoutubeJavaTraining;

import java.util.Scanner;

public class SwitchStatement {
	public static void main(String []args){
		
		int age;
		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();
		
		switch (age){
		case 0:System.out.println("zero");
		break;
		case 1:System.out.println("one");
		break;
		case 2:System.out.println("two");
		break;
		case 3:System.out.println("three");
		break;
		case 4:System.out.println("four");
		break;
		case 5:System.out.println("five");
		break;
		default:System.out.println("cannot determain");
		break;
			
		}
	}
	
}