package june18;
import java.util.*;
public class binary_exponentiation {

	public static void main(String[] args) {
		int x=2;
		int n=4;
		System.out.println(binexpo(x,n));
	}

	private static int binexpo(int x, int n) {
		// TODO Auto-generated method stub
		if (n==0)
		{
			return 1;
		}
		int ans1 = binexpo(x, n/2);
		int ans2 = ans1*ans1;
		if (n%2==0)
		{
			return ans2;
		}
		return x*ans2;
	}

}
