import java.lang.*;
import java.util.*;

//jodi public class use kori naming convention hisebe tokhon file
//name should be same as the class name....otherwise filename can be different....and
//only during the execution with "java" command we need to keep in mind that the
//compiled filename will be same as the class name....


public class ReadKeyBoard 
{
	public static void main(String srg[])
	{
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		System.out.println("The number is "+x);
	}
}