package june18;
import java.util.*;
public class sum_of_digits_of_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=21;
		System.out.println(sum(n));
	}
	private static int sum(int n) {
		int ans=0;
		if (n==0)
		{
//			System.out.println(ans);
			return 0;
		}
//		while (n!=0)
//		{
//			int a = n%10;
//			ans = ans+a;
//			n=n/10;
//		}
//		System.out.println(ans);
//		int ans = sum(n%10)+sum(n/10);
//		System.out.println();
		return n%10+sum(n/10);
	}
}
