package NewYoutubeJavaTraining;
class Practice {
	public static void main(String args[]){	
		
		String[] s1 = {"random","public","static","void","main","next"};
		String[] s2 = {"new","java","program","random","ssyos","srgs"};
		String[] s3 = {"appa","amma","anna","vijai","dee"};
		
		int length1 = s1.length;
		int length2 = s2.length;
		int length3 = s3.length;
		
		int rand1 = (int)(Math.random()*length1);
		int rand2 = (int)(Math.random()*length2);
		int rand3 = (int)(Math.random()*length3);
		
		String last = s1[rand1]+" "+s2[rand2]+" "+s3[rand3];
		
		System.out.println("Randomly generated words are: "+last);
	}
}