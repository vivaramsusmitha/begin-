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
		int n, max;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		int a[] = new int[n];
		//System.out.println("Enter elements of array:");
		for(int i = 0; i < n; i++)
		 {
			 a[i] = s.nextInt();
		 }
			 max = a[0];
		for(int i = 0; i < n; i++)
		{
			 if(max < a[i])
            	{
            		 max = a[i];
		 }
		 }
		 System.out.println(+max);
    }
	
}
