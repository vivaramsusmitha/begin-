/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class sort
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int n, temp;
        Scanner s = new Scanner(System.in);
        //System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        //System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++) 
        {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
           {
                if (a[i] > a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        //System.out.print("ascending order");
        for (int i = 0; i < n - 1; i++) 
        {
            System.out.print(a[i] + " ");
        }
        System.out.print(a[n - 1]);
    
         
	}
}
