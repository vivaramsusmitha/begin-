/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int n,k,result=1;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		k=s.nextInt();
		if(n>=0 && k==0)
		{
			result=1;
		}
		else
		{
			for(int i=0;i<k;i++)
			{
				result=result*n;
			}
		}
         
		System.out.println(result);	// your code goes here
	}
}
