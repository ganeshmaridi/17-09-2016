import java.util.*;
public class Miss
{
	public static void main(String args[])
	{
		Missingchar M=new Missingchar();
		String s,h;
		Scanner in=new Scanner(System.in);
		s=in.nextLine();
		int a;
		a=in.nextInt();
		h=M.missingChar(s,a);
		System.out.print(h);
	}
}		
