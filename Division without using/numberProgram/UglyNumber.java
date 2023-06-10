package numberProgram;
import java.util.Scanner;
public class UglyNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		if(n>1) {
			if(isUgly(n)) {
				System.out.println(n+" is Ugly Number.");
			}else {
				System.out.println(n+" is not Ugly Number.");
			}			
		}else {
			System.out.println(n+" is not Ugly Number.");			
		}
		sc.close();
	}
	
	public static boolean isUgly(int num) {
		while (num!=1) {
			if(num%2==0) {
				num/=2;
			}else if(num%3==0) {
				num/=3;
			}else if(num%5==0) {
				num/=5;
			}else {
				return false;
			}
		}
		return true;
	}
}
