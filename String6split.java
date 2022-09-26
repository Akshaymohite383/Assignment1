package Com.yash.string;

public class String6split {
	
		//WAP to implement split function.

		   public static void main(String[] args) {
		        String st="Akshay";
		        char[]length=st.toCharArray();
		        int newLength=0;
		        for(char c:length)
		        {
		            newLength ++;
		        }
		        System.out.println("Length of string:"+newLength);
		        char ch[]=st.toCharArray();
		        for(int i=0;i<ch.length;i++)
		        {
		             System.out.print("[" + ch[i] + "]");
		        }
		        System.out.println("\n");
		        String te="";
		        boolean flag=false;
		        System.out.println("split");
		        for(int i=0;i<ch.length;i++)
		        {
		            if(ch[i]!=' ')
		            {
		                te=te+ch[i];
		                flag=false;
		            }
		            else {
		                flag=true;
		            }
		            if(flag||i==newLength-1)
		            {
		                System.out.println(te);
		                te="";
		            }
		        }
		        



		   }
}
