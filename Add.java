import java.util.*;
public class Add
{
	public static void main(String args[])
	{
		String h;
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		int l=s.length();
		char c=s.charAt(l-1);
		StringBuilder sb=new StringBuilder();
		sb.append(c);
		sb.append(s);
		sb.append(c);
		h=sb.toString();
		System.out.print(h);
	}
}		
