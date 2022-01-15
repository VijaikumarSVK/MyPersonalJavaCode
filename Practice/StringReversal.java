package Practice;

class StringReversal {

	public static void main(String args[]) {

		int i, m = 0, f = 0;

		int n = 99;
		m = n / 2;

		if (n == 0 || n == 1) {
			System.out.println("it is not a prime number");
		} else {
			for (i = 2; i < m; i++) {
				if (n % i == 0) {
					System.out.println("it is not a prime");
					f = 1;
					break;
				}
			}
		}
		if(f == 0){
			System.out.println("it is a prime");
		}

	}

}