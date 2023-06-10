package numberProgram;

import java.util.Scanner;

public class AutomorphicNumberProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int ip = sc.nextInt();
		int square = ArmStriomgNumber.power(ip, 2);

		int ct = ArmStriomgNumber.countOfDigit(ip);
		// System.out.println(square);
		int ans = ArmStriomgNumber.power(10, ct);
		// System.out.println(ans);
		if (ip == (square % ans)) {
			System.out.println(ip + " Is Automorphic Number.");
		} else {
			System.out.println(ip + " Is Not Automorphic Number.");
		}
		sc.close();
	}

}
