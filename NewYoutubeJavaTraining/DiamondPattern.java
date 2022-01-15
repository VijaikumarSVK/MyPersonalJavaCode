package NewYoutubeJavaTraining;

public class DiamondPattern {

	public static void main(String[] args) {


		int i, j, row = 5;

		for (i = 0; i <= row; i++) {
			for (j = row; j >= i; j--) {
				System.out.print(" ");
			}
			for (j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(i =1;i<=row;i++){
			for(j=0;j<=i;j++){
				System.out.print(" ");
			}
			for(j=row;j>=i;j--){
				System.out.print("* ");
			}System.out.println();
		}
		
	}

}
