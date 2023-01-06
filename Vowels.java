import java.util.Scanner;
class Vowels 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
        
		System.out.println("Enter the Chartecter :");
		char ch = scan.next().charAt(0);

		if (ch >= 'a' && ch <= 'z' || ch >='A' && ch <= 'Z')
		{
			switch (ch)
			{
			    case 'a':
				case 'A':
				case 'e':
				case 'E':
				case 'i':
				case 'I':
				case 'o':
				case 'O':
				case 'u':
				case 'U':
				{
					System.out.println("It is a Vowels");
					break;
				}
				default:
				{
					System.out.println("It is a Consonant");
				}
			
			}
		} 
		else
		{
			System.out.println("It is not an Alphabet");
		}

		 
	}
}
