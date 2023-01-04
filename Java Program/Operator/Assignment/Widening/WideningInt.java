class WideningInt 
{
	public static void main(String[] args) 
	{
		int i = 145;   // 4 byte 

		long l = i;
		System.out.println(i);  // convert 4 byte into 8 byte 

		float f = i;
		System.out.println(f);   // convert 4 byte into 4 byte

		double d = i;
		System.out.println(d);   // convert 4 byte into 8 byte


	}
}


// short byte char not possble becuse size is less from int 