package numberProgram;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int ip = sc.nextInt();

		if (isNeon(ip)) {
			System.out.println(ip + " is Neon Number.");
		} else {
			System.out.println(ip + " is Not Neon Number.");
		}
		sc.close();
	}

	public static boolean isNeon(int n) {
		int square = n * n;
		int s = HarshadNumber.sumOfDigit(square);
		if(n==s) {
			return true;
		}else {
			return false;
		}
	}

}
