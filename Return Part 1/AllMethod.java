//1    >>> Reverse Number  ==>   AllMethod.revNumber(ip);
//2    >>> Count Digit     ==>   AllMethod.countDigit(ip);
//3    >>> Product of Digit===>  AllMethod.prodOfDigit(ip);
//4    >>> Sum Of Digit    ===>  AllMethod.sumOfDigit(ip);
//5    >>> Max of two number===> AllMethod.maxOfTwo(a,b);
//6    >>> Power of nuber  ===>  AllMethod.power(base,raise);


import java.util.Scanner;
class  AllMethod
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);

		System.out.print("Enter the Number : ");
		int ip = s.nextInt();
		
		System.out.println(ip+" Reverse of a Number is : "+revNumber(ip));

		System.out.println(ip+" count of digit of a number is : "+countDigit(ip));

		System.out.println(ip+" product of digit of a Number is : "+prodOfDigit(ip));

		System.out.println(ip+" Sum of digit of a number : "+sumOfDigit(ip));
		
		System.out.print("Enter the value of a is : ");
		int a= s.nextInt();
		System.out.print("Enter the value of b is : ");
		int b= s.nextInt();
		System.out.println("max of two number : "+maxOfTwo(a,b));
		System.out.println("min of two number : "+minOfTwo(a,b));

		System.out.print("Enter the base value : ");
		int base = s.nextInt();
		System.out.print("Enter the raise value : ");
		int raise =s.nextInt();

		System.out.println(power(base,raise));

		System.out.println("Enter the number : ");
		int num = s.nextInt();
		if (prime(num))
		{
			System.out.println(num+ " is Prime Number.");
		}else
		{
			System.out.println(num+ " is Not Prime Number.");
		}


	}

//1	// Reverse Number Method 

	public static int revNumber(int num)
	{
		int rev = 0;
		for (int i=num ; i!=0 ; i/=10 )
		{
			rev = rev * 10 + i%10;
		}
		return rev;
	}




//2	// count of digit Method 

	public static int countDigit(int Num)
	{
		int ct = 0;

		for (int i = Num ; i!=0 ; i/=10 )
		{
			ct++;
		}
		return ct;
	}

//3	//product of digit Method

	public static int prodOfDigit(int num)
	{
		int prod =1;
		while (num != 0)
		{
			int rem = num%10;
			prod= prod * rem;
			num /=10;
		}
		return prod;
	}

//4  // Sum of Digit Of a number

    public static int sumOfDigit(int num)
	{
		int sum = 0 ;
		for (int i=num ; i!=0 ; i/=10 )
		{
			int rem = i%10;
			sum += rem;
		}
		return sum;
	}

//5  // max of two number 
    public static int maxOfTwo(int a ,int b)
	{
		int ans = a>b ? a:b;
		return ans;
	}

//6  // min of two number 

	public static int minOfTwo(int x, int y)
	{
		int min = x<y? x:y;
		return min;
	}

//7  // power of number 
    
	public static int power(int base, int raise)
	{
		int pow = 1;
		for (int i=1 ; i<=raise ; i++ )
		{
			pow*=base;
		}
		return pow;
	}

//8 // check prime 
	
	public static boolean prime(int num)
	{ 
		for (int i =2 ; i<=num/2 ; i++ )
		{
			if (num%i==0)
			{
				return false;	
			}
		}
		return true;
	}
}
