package CSEndSemLab;

import java.math.*;

public class RSAQuestion2 {
	public static void main(String args[]) {
		int msg = 6;
		int t;
		BigInteger msgback;
		int p = 11;
		int q = 3;
		int n = p * q;
		System.out.println("value of p :" + p);
		System.out.println("value of q :" + q);
		System.out.println("message to encypt: 6");
		int z;
		z = (p - 1) * (q - 1);
		System.out.println("calculated value of z is " + z);
		int e;
		int i;
		for (e = 2; e < z; e++) {

			if (gcd(e, z) == 1) {
				break;
			}
		}
		System.out.println("The value of e is " + e);

		int d = 0;

		for (i = 0; i <= 9; i++) {
			int x = 1 + (i * z);

			if (x % e == 0) {
				d = x / e;
				break;
			}
		}
		System.out.println("Calculated value of d is " + d);
		System.out.println("Public key e=" + e + "; n=" + n);
		System.out.println("Private key d=" + d + ": n=" + n);

		t = (int) ((Math.pow(msg, e)) % n);

		System.out.println("Encrypted message for given value is : " + t);

		BigInteger N = BigInteger.valueOf(n);

		BigInteger C = BigDecimal.valueOf(t).toBigInteger();
		msgback = (C.pow(d)).mod(N);
		System.out.println("Decrypted message for given value is : " + msgback);
	}

	static int gcd(int e, int z) {
		if (e == 0)
			return z;
		else
			return gcd(z % e, e);
	}
}