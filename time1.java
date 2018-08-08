/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" ony if the class is public. */
class time
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int h1,h2,m1,m2;
		Scanner s=new Scanner(System.in);
		h1=s.nextInt();
		m1=s.nextInt();
		h2=s.nextInt();
		m2=s.nextInt();
		if((h1>h2)&&(m1>=m2))
		{
			int s1=h1-h2;
			int s2=m1-m2;
			System.out.print(s1);
			System.out.print(" ");
			System.out.print(s2);
			
		}
		else
		{
			int s1=h2-h1;
			int s2=m2-m1;
			System.out.print(s1);
			System.out.print(" ");
			System.out.print(s2);
		}
		
		
		
	}
}
