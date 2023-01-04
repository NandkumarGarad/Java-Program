class WideningByte 
{
	public static void main(String[] args) 
	{
		byte b = 127;          //size 1 byte

		short s = b;           // size 1 byte convert into 2 byte
		System.out.println(s);

		int i = b;              // size 1 byte convert into 4 byte
		System.out.println(i);

		long l = b;             // size 1 byte convert into 8 byte
		System.out.println(l);

		float f = b;             // size 1 byte convert into 4 byte
		System.out.println(f);

		double d = b;            // size 1 byte convert into 8 byte
		System.out.println(d);

	//	char ch = b;                  
	//size 1 byte convert into 2 byte    
	//	System.out.println(ch);  //error: incompatible types: possible lossy conversion from byte to char

//not possibale	//	boolean b2 = b;          //size 1 byte convert into 1 bits   
	           //	System.out.println(b2);  //error: incompatible types: byte cannot be converted to boolean
		 
		 
	}
}
