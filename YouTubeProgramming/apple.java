package YouTubeProgramming;

import javax.swing.JFrame;

public class apple {

	public static void main(String[] args) {

//		orrange obj = new orrange();
//		
//		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		obj.setSize(500,500);
//		obj.setVisible(true);
		
		fruit count[] = new fruit[3];
		count[0] = new fruit();
		count[1] = new mango();
		count[2] = new pineapple();
		
		for (int i = 0;i<count.length;i++)
			count[i].test();
		
	}

}
