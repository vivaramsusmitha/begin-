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
		int small, size, i;
       int arr[] = new int[50];
       Scanner scan = new Scanner(System.in);
	   
      // System.out.print("Enter Array Size : ");
       size = scan.nextInt();
	   
       System.out.print("Enter Array Elements : ");
       for(i=0; i<size; i++)
       {
           arr[i] = scan.nextInt();
       }
	   
       //System.out.print("Searching for the Smallest Element....\n\n");
	   
       small = arr[0];
	   
       for(i=0; i<size; i++)
       {
           if(small > arr[i])
           {
               small = arr[i];
           }
           
       }
	   
       System.out.print( + small); 
   }
	}
