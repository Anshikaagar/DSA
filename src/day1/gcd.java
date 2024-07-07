package day1;

public class gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ans=gcd(20,50);
		System.out.println(ans);

	}
	public static int gcd(int a, int b)
	{
		while (a>0 && b>0)
		{
			if (a>b)
			{
				a=a%b;
			}
			else
			{
				b=b%a;
			}
			if (a==0)
			{
				return b;
			}
			if (b==0)
			{
				return a;
			}
		}
		return 1;
	}

}
