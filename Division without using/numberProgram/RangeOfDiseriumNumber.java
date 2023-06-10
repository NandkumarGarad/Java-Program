package numberProgram;

import java.util.Scanner;

public class RangeOfDiseriumNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the start number");
		int start =sc.nextInt();
		System.out.println("Enter the end number");
		int end = sc.nextInt();
		
		for (int i = start; i <= end; i++) {
			if(DiseriumNumber.isDiseriumNumber(i)) {
				System.out.print(i+" ");
			}
		}
		sc.close();
	}

}
