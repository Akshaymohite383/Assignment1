package Com.yash.string;

public class Stringlength {
	public static int myStringLength(String inputstring)
	{

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
		return count;
	}
	}

