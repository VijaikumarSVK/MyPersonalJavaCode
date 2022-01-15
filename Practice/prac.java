package Practice;

public class prac {

	public static void main(String[] args) {

		String cellloc = "F6:F10";

		getoutput(cellloc);

	}

	public static void getoutput(String loc) {

		String arr[] = loc.split(":");

		if (arr[0].equals(arr[1])) {
			System.out.println("INVALID");
		} else {

			String cel1a = arr[0].substring(0, 1);
			String cel1b = arr[0].substring(1);
			String cel2a = arr[1].substring(0, 1);
			String cel2b = arr[1].substring(1);
			int cel1 = Integer.parseInt(cel1b);
			int cel2 = Integer.parseInt(cel2b);
			int difference = (Math.abs(cel1 - cel2)) + 1;
			char ch1 = cel1a.charAt(0);
			char ch2 = cel2a.charAt(0);
			int cel1ascii = (int) ch1;
			int cel2ascii = (int) ch2;
			int charDifference = (Math.abs(cel1ascii - cel2ascii)) + 1;
			int totalCell = difference * charDifference;
			System.out.println("Total cell is: " + totalCell);

		}
	}
}
