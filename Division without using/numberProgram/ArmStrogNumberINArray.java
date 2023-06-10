package numberProgram;

public class ArmStrogNumberINArray {
	public static void main(String[] args) {
		int[] a = { 150, 153, 174, 9, 3, 8,-153,-5,0,407 };
		for (int i = 0; i < a.length; i++) {
			int ct = ArmStriomgNumber.countOfDigit(a[i]);
			if(a[i]==ArmStriomgNumber.isArmStrong(a[i], ct)) {
				System.out.print(a[i]+" ");
			}
		}
	}
}
