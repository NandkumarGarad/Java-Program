package numberProgram;

public class GreatestCommonDivisor {
	public static void main(String[] args) {
		int a = 28;
		int b =28;
		System.out.println(greatestCommonDivisor(a, b));
	}
	public static int greatestCommonDivisor(int a,int b) {
		int max=a>b?a:b;
		for (int i = max;  ; i++) {
			if(i%a==0 && i%b==0) {
				return i;
			}
		}
	}
}
