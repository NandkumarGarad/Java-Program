package numberProgram;

import java.util.Scanner;

public class PrintDigitOfNumber {
	public static void main(String[] args) {
	Scanner	 sc = new Scanner(System.in);
	System.out.println("Enter the Number : ");
		int n = sc.nextInt();
		 
		 while(n!=0) {
			 int div=n/10;
			 int rem =n- div*10;
			 System.out.println(rem);
			 n/=10;
		 }
			sc.close();
		}
}
