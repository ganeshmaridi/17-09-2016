public class Palindrome
{
	public static void main(String args[])
	{
		String s="malayalam";
		int l=s.length();
		int j,i;
		for(i=0,j=l-1;i<l/2;i++,j--)
		{
			if(s.charAt(i)!=s.charAt(j))
			{
				System.out.print("not palindrome");
				break;
			}
		}
		System.out.print("palindrome");
	}
}			
				
