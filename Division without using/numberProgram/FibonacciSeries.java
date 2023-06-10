package numberProgram;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many number you ?");
		int ip = sc.nextInt();
		isFibonacciSeries(ip);
		sc.close();
	}
	public static void isFibonacciSeries(int n)
	{
		int a=0,b=1,c;
		while (n-->0) {
			c= a+b;
			System.out.print(a+" ");
			a=b;
			b=c;
		}
	}
}
