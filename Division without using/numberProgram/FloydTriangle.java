package numberProgram;
public class FloydTriangle {
	public static void main(String[] args) {
		int n=5;

		for (int i = 0,k=1; i <n; i++) {
			for (int j = 0; j <=i; j++) {
				System.out.print(k+++" ");
			}
			System.out.println();
		}
	}
	
}
