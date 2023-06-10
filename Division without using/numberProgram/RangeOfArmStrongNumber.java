package numberProgram;

import java.util.Scanner;

public class RangeOfArmStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Strating number");
		int start = sc.nextInt();
		System.out.println("Enter the Ending number");
		int end = sc.nextInt();
		for (int i =start ; i <= end; i++) {
			int ct =ArmStriomgNumber.countOfDigit(i);
			if(i==ArmStriomgNumber.isArmStrong(i, ct)) {
				System.out.print(i+" ");
			}
		}
		sc.close();
	}

}
