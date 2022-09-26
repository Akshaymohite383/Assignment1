package Com.yash.string;
import java.util.Scanner;
public class Task3 {
	public static void main(String[] args) 
	{
		//Accepting the string from user
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the string");
		String inputstring=sc.nextLine();
		
		
		int i=0;
		int count=0;
		int flag=0;
		while(true)
		{
			try
			{
			char ch=inputstring.charAt(i);
			count++;
			}
			catch (StringIndexOutOfBoundsException e) 
			{
				flag=1;
			}
			if(flag==1)
			{
			break;	
			}
			i++;
				
		}
		//lenght Without Using inbuilt methoed  
		System.out.println(count);
		
		String output="";
		
		//logic for smalltocapital capito small
		for(int i1=0;i1<count;i1++)
		{
		char ch=inputstring.charAt(i1);
			if(ch<=90 && ch>=65)
			{
				char ch1=(char) (ch+32);
				output+=ch1;
			}
			else if(ch>=97 && ch<=122) 
			{
				char ch1=(char) (ch-32);
				output+=ch1;
				
			}
			else
			{
				output+=ch;
			}
		}
		
		//printing the result of program
		
		System.out.println("Given InputString ="+ inputstring);
		System.out.println("Result OutputString ="+output);
		
		
	}
	}

