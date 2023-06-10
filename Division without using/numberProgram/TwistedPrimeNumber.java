package numberProgram;

import java.util.Scanner;

public class TwistedPrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		if (isPrime(num)) {
			if (isPrime(reverseNum(num))) {
				System.out.println(num + " is Twisted Prime Number.");
			} else {
				System.out.println(num + " is Not Twisted Prime Number.");
			}
		} else {
			System.out.println(num + " is Not Twisted Prime Number.");
		}
		sc.close();
	}

	public static int reverseNum(int num) {
		int rev = 0;
		for (int i = num; i != 0; i /= 10) {
			rev = rev * 10 + i % 10;
		}
		return rev;
	}

	public static boolean isPrime(int num) {
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
