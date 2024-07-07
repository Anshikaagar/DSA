package june18;
import java.util.*;
public class exponentiation {

	public static void main(String[] args) {
		int x=2;
		int n=2;
		System.out.println(expo(x,n));
	}

	private static int expo(int x, int n) {
		// TODO Auto-generated method stub
		if (n==0)
		{
			return 1;
		}
		return x*expo(x,n-1);
		
		
	}

}
