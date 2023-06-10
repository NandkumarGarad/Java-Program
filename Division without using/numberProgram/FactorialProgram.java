package numberProgram;

import java.util.Scanner;

public class FactorialProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Frist Nubmer");
		int ip = sc.nextInt();
		
		System.out.println(factorial(ip));
		sc.close();
	}
	
	public static int factorial(int n) {
		if(n==1) {
			return 1;
		}else {
			return n*factorial(n-1);
		}
	}
}
