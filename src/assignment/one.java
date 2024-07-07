package assignment;
import java.util.*;
public class one {
	public static void main(String[] args) {
		int n=121;
		int m=n;
		long ans=0;
		while (n!=0)
		{
			int a=n%10;
			ans= a + ans*10;
			n=n/10;	
		}
		if(ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE)
		{
			System.out.println(0);
		}	
		System.out.println((int)ans);
	}
}