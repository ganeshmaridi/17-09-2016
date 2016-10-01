import java.util.*;
public class Counting
{
	public static void main(String args[])
	{
		int count=0,i;
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		int l=s.length();
		StringBuilder sb=new StringBuilder(s);
		for(i=0;i<=l-1;i++)
		{
			if(sb.charAt(i)=='e')
			{
				count++;
			}
		}
	    co k=new co();
	    boolean b=k.containE(count);
        if(b)
        System.out.print("true");
        else
        System.out.print("false"); 	
	}
}
	class co
	{
		public boolean containE(int count)
		{
			
			if((count>=1)&&(count<=3))
			{
				return true;
			}
			else 
			{
				return false;
			}	
		}
	}
			
