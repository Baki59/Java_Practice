import java.lang.*;

class literals
{
	public static void main(String arg[])
	{
		byte b1=10;
		byte b2=0b1010;
		byte b3=012;
		byte b4=0xA;
		
		long l=125;
		
		long l1 = 999999999999l; //we can use undescore to make it more readable...
		//for example: 999_999_999....
		// 999_999_999_ : not allowed
		//999_999.985 : allowed
		
		//999_999_.89 : not allowed
		
		System.out.println("The Decimal value of the Given Value: "+b1);
		System.out.println("The Binary value of the Given Value: "+b2);
		System.out.println("The Octal value of the Given Value: "+b3);
		System.out.println("The Hexadecimal value of the Given Value: "+b4);
		
		System.out.println("The Long value: "+l);
		System.out.println("The Long long value: "+l1);
		
		//it will cause error...
		//int i=125L;
		
		///float f =12.56; //it will give error...
		double d = 12.56; //it is perfect
		
		float f = 12.56f; //perfect
		double d1 = 12.56d; //also perfect
		
	}
}