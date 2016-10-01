public class Missingchar
{
	public String missingChar(String s,int a)
	{
		StringBuffer sb=new StringBuffer(s);
        sb.deleteCharAt(a);
        return sb.toString();
     }
}        
		
