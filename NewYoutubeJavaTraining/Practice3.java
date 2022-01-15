package NewYoutubeJavaTraining;

public class Practice3 {
	public static void main(String[] args) {
	
		int i,j,k=9;
	
		for(i=1;i<=k;i++){
			for(j=1;j<=i;j++){
				System.out.print(" ");
			}
			for(j=i;j<=k;j++){
				System.out.print(j);
			}		
			System.out.println();	
		}
		for(i=8 ;i>=1;i--){
			for(j=1;j<=i;j++){
				System.out.print(" ");
			}
			for(j=i;j<=k;j++){
				System.out.print(j);
			}
			System.out.println();		
		}		
	}
}