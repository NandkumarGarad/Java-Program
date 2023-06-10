package numberProgram;

import java.util.Scanner;

public class FactorsProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int ip = sc.nextInt();
		factor(ip);
		sc.close();
	}

	public static void factor(int n) {
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
			}
		}
	}
}
