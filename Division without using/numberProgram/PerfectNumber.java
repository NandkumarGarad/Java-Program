package numberProgram;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number ");
		int num = sc.nextInt();
		if(sumOfDigit(num)==productOfDigit(num)) {
			System.out.println(num+ " is Perfect Number.");
		}else {
			System.out.println(num+ " is Not Perfect Number.");
		}
		sc.close();
	}
	
	public static int sumOfDigit(int n) {
		int sum = 0;
		while (n != 0) {
			int rem = n % 10;
			sum += rem;
			n /= 10;
		}
		return sum;
	}
	public static int productOfDigit(int n) {
		int prod = 1;
		while (n != 0) {
			int rem = n % 10;
			prod *= rem;
			n /= 10;
		}
		return prod;
	}
	
}
