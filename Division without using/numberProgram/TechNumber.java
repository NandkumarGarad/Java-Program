package numberProgram;

import java.util.Scanner;

public class TechNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number.");
		int n = sc.nextInt();
		int square = n * n;
		int ct = ArmStriomgNumber.countOfDigit(n);
		int div = ArmStriomgNumber.power(10, ct / 2);
		if (ct % 2 == 0) {
			int first = square / div;
			int last = square % div;
			int sum = first + last;
			if (n == sum) {
				System.out.println(n + " is a Tech Number.");
			} else {
				System.out.println(n + " Not a Tech Number.");
			}
		} else {
			System.out.println(n + " Not a Tech Number.");
		}
		sc.close();
	}

}
