package numberProgram;

import java.util.Scanner;

public class RangeOfNeonNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Starting number");
		int start = sc.nextInt();
		System.out.println("Enter the Ending Number");
		int end = sc.nextInt();
		for (int i = start; i <= end; i++) {
			if(NeonNumber.isNeon(i)) {
				System.out.print(i+" ");
			}
		}
		sc.close();
	}

}
