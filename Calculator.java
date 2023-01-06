import java.util.Scanner;

class Calculator 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
	    
		System.out.println("Enter the First Value :");
		int a = scan.nextInt();


		System.out.println("Enater the Operaor :");
		char ch = scan.next().charAt(0);

		System.out.println("Enter the Scecond Value :");
		int b = scan.nextInt();

		if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%')
		{
			switch (ch)
		{
		case '+': System.out.println("Sum of two number is :"+ (a+b));
		          break;
	    case '-': System.out.println("Diffrences betn two Number is  :"+ (a-b));
		          break;
	    case '*': System.out.println("Product of two number is :"+ (a*b));
		          break;
	    case '/': System.out.println("Division of two number is :"+ (a/b));
		          break;
	    case '%': System.out.println("moduls is :"+ (a%b));
		          break;
		
		} 
		}
		else
		{
			System.out.println(" Invalid Operators");
		}

		 
	}
}
