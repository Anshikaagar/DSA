package assignment;
import java.util.*;
public class three {
	public static void main(String[] args) {
		int a=14;
		int b=8;
//		int lcm=1;
//		for (int i=1; i<=a; i++)
//		{
//			if (a%i==0 && b%i==0)
//			{
//				lcm*=i;
//			}
//		}
//		System.out.println(lcm);
//		int n=hcf(a,b);
//		int lcm = (a*b)/hcf(a,b);
//		System.out.println(n+"   "+lcm);
		int [] arr = lcmhcf(a,b);
		for (int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

	private static int hcf(int a, int b) {
		// TODO Auto-generated method stub
		while (a>0 && b>0)
		{
			if (a>b)
			{
				a=a%b;
			}
			else if (b>a)
			{
				b=b%a;
			}
			if (a==0)
			{
//				System.out.println(b);
				return b;
			}
			if (b==0)
			{
//				System.out.println(a);
				return a;
			}
		}
		return 0;		
	}
	public static int[] lcmhcf(int a, int b)
	{
		int [] arr = new int[2];
		arr[1] =hcf(a,b);
		arr[0] = (a*b)/hcf(a,b);
		return arr;
	}
}
