package june18;
import java.util.*;
public class recursive_function {
	public static void main(String[] args) {
		String str = "aba";
		System.out.println(palin(str));
//		palin(str);
	}
	private static boolean palin(String str) {
		if (str.length()==0)
		{
			return false;
		}
		String str1="";
		for (int i=str.length()-1; i>=0; i--)
		{
			str1= str1+str.charAt(i);
		}
		System.out.println(str1);
		if (str1==str)
		{
			return true;
		}
		return false;
		
//		palin(str, str1+str.charAt(idx), idx+1);
		
	}
}