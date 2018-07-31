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
		int i,fact=1;  
  int number;
  Scanner s=new Scanner(System.in);
  number=s.nextInt();//It is the number to calculate factorial    
  for(i=1;i<=number;i++){    
      fact=fact*i;    
  }    
  System.out.println(+fact);    
 }  
	
}
