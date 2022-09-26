package Com.yash.string;
import java.util.Scanner;

import Com.yash.string.*;
import Com.yash.string.*;

public class Task2string {
	public class Task2stringinstring extends Custommethod
	{
	public static void main(String[] args) 
	{
		//Accepting the string from user
				Scanner sc= new Scanner(System.in);
				System.out.println("enter the inputstring1");
				String inputstring1=sc.nextLine();
				
				System.out.println("enter the inputstring2");
				String inputstring2=sc.nextLine();
				
				//find string by using custom methoed
			int len1=Custommethod.myStringLength(inputstring1);
			int len2=Custommethod.myStringLength(inputstring2);
			
			int count=0;
			if(len1<len2)
			{
				System.out.println("NOT Substring");
			}
			else 
			{
			int k=0;
			for(int i=0;i<len2;i++)
			{
		         
				for(int j=k;j<len1;j++)
				{
			  
					if(Custommethod.myCharAt(i, inputstring2)==Custommethod.myCharAt(j, inputstring1))
					{
						k=j;
						count++;
						break;
					}
				}
			}
			
			if(len2==count)
			{
				System.out.println("substring");
			}
			else
			{
				System.out.println("NOT substring");
			}
			}
			
			
			}
	}}
