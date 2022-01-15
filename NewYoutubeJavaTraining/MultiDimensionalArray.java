package NewYoutubeJavaTraining;

public class MultiDimensionalArray {

	public static void main(String[] args) {
	
		int firstarray [][] = {{12,45,85,65,98},{54,87,96,32,68}};
		int secondarray [][] = {{485,256,486,25,7425},{45,78,96,36,458}};
		
		System.out.println("This is the first array:");
		method(firstarray);
		System.out.println("This is the second array:");
		method(secondarray);
	}
	
	public static void method(int x[][]){
		for(int row=0;row<x.length;row++){
			for (int column=0;column<x[0].length;column++){
				
				System.out.print(x[row][column]+"\t");
			}
			System.out.println();
		}			
	}
}
