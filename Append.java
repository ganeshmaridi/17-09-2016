import java.util.*;
public class Append
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		String s1,s2,s3;
		s1=in.nextLine();
		s2=in.nextLine();
        App g=new App();
        s3=g.embedWord(s1,s2);
        System.out.print(s3);	
	}
}
class App
{
			public String embedWord(String s1,String s2)
			{
				String s3;
				StringBuffer sb=new StringBuffer();
				int l=s1.length();
				sb.append(s1.substring(0,l/2));
				sb.append(s2);
				sb.append(s1.substring(l/2,l));
				s3=sb.toString();
				return s3;
			}
}				
