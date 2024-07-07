package june18;
import java.util.*;
import java.math.*;
public class gcd {
	public static void main(String[] args) {
		int n=4;
		int m=12;
		System.out.println(gcd(n,m));

	}

	private static int gcd(int n, int m) {
		// TODO Auto-generated method stub
		return gcd(Math.min(m,n));
		
	}

}
