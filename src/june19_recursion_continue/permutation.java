package june19_recursion_continue;
import java.util.*;
public class permutation {
	public static void main(String[] args) {
		String str = "abc";
		permutation(str, "");

	}
	private static void permutation(String str, String ans) {
		if (str.length()==0)
		{
			System.out.println(ans);
			return;
		}
		for (int i=0; i<str.length(); i++)
		{
			char choose = str.charAt(i);
			String next = str.substring(0,i)+str.substring(i+1);
			permutation(next, ans+choose);
		}	
	}

}
