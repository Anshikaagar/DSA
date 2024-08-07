package june_25;
public class palindrome_partitioning {
	public static void main(String[] args) {
		String st="naman";
		partition(st,"");

	}
	public static boolean isPalindrome(String str)
	{
		int s=0;
		int e= str.length()-1;
		while (s<e)
		{
			if (str.charAt(s)!= str.charAt(e))
			{
				return false;
			}
			s++;
			e--;
		}
		return true;
	}
	public static void partition(String que, String ans)
	{
		if (que.length()==0)
		{
			System.out.println(ans);
			return;
		}
		for (int part=1; part<=que.length(); part++)
		{
			String partition = que.substring(0,part);
			String remain = que.substring(part);
			if(isPalindrome(partition))
			{
				partition(remain, ans+partition+" ");
			}
		}
	}
}