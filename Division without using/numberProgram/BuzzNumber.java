package numberProgram;

import java.util.Scanner;

public class BuzzNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		if (isBuzz(num)) {
			System.out.println(num + "  is Buzz Number");
		} else {
			System.out.println(num + "  is Not Buzz Number");
		}
		sc.close();

	}

	public static boolean isBuzz(int n) {
		if (n % 7 == 0 || n % 10 == 7) {
			return true;
		}
		return false;
	}
}
