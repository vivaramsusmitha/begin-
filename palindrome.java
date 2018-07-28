/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int n,reversedInteger=0,remainder,originalInteger;
		System.out.println("enter n value");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		originalInteger=n;
		while(n !=0)
		{
			remainder=n%10;
			reversedInteger=reversedInteger*10+remainder;
			n/=10;
			
		}
		if(originalInteger==reversedInteger)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("no");
		}
		
	}
}
