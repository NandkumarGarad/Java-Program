package numberProgram;

import java.util.Scanner;

public class RangeOfBuzzNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Start Number : ");
		int first = sc.nextInt();
		
		System.out.println("Enter the End Number : ");
		int end = sc.nextInt();
		
		for (int i = first; i < end; i++) {
			if(BuzzNumber.isBuzz(i)) {
				System.out.print(i+" ");
			}
		}
		
		sc.close();
	}
}
