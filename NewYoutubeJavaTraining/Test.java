package NewYoutubeJavaTraining;

public class Test {

	public static void main(String[] args) {
		int firstarray[][]={{4,5,6,5},{7,8,9,7}};

		System.out.println("This is the first array:");
		method(firstarray);

	}

	public static void method(int x[][]) {
		for (int row = 0; row < x.length; row++) {
			for (int coloumn = 0; coloumn < x[row].length; coloumn++) {
				System.out.print(x[row][coloumn] + "\t");
			}System.out.println();
		}
	}
}