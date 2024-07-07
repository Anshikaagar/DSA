package assignment;
import java.util.*;
public class four {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=372;
		int m=n;
		int len =Integer.toString(n).length();
		int sum=0;
		while (n>0)
		{
			int a = n%10;
			sum+= Math.pow(a, len);
			n=n/10;
		}
		if (m==sum)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}

	}

}
