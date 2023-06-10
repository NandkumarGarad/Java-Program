package numberProgram;

import java.util.Scanner;

public class RangeOfAutomorphicNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number");
		int start = sc.nextInt();

		System.out.println("Enter the end Number");
		int end = sc.nextInt();
		System.out.println("Automorphic Number is ");
		for (int i = start; i <= end; i++) {
			if(isAutomorphicNum(i)) {
				System.out.println(i +" ");
			}
		}
		sc.close();
	}

	public static boolean isAutomorphicNum(int num) {
		int square = ArmStriomgNumber.power(num, 2);

		int ct = ArmStriomgNumber.countOfDigit(num);

		int ans = ArmStriomgNumber.power(10, ct);

		if (num == (square % ans)) {
			return true;
		} else {
			return false;
		}
	}
}
