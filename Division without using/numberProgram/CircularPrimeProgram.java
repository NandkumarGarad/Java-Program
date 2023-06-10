package numberProgram;

import java.util.Scanner;

public class CircularPrimeProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int ip = sc.nextInt();// 1931

		if (isPrime(ip)) {
			int roteate = roteateNum(ip);// 1193
			while (ip != roteate) {// 1931 != 1193
				if (isPrime(roteate)) {
					roteate = roteateNum(roteate);
				} else {
					break;
				}
			}
			if (ip == roteate) {
				System.out.println(ip + " is Circular Prime Number.");
			} else {
				System.out.println(ip + " is Not Circular Prime Number");
			}
		} else {
			System.out.println(ip + " is Not Circular Prime Number");
		}
		sc.close();
	}

	public static int roteateNum(int n) {// 1931

		int ct = ArmStriomgNumber.countOfDigit(n);// 4
		int pow = ArmStriomgNumber.power(10, ct - 1);// 1000
		int rem = n % 10;// 1
		n /= 10; // 193
		int rot = pow * rem + n;// 1000*1+193 == 1193
		return rot;
	}

	public static boolean isPrime(int n) {
		if (n > 1) {
			for (int i = 2; i <= n / 2; i++) {
				if (n % i == 0) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}
}
