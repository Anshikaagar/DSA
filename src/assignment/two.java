package assignment;

public class two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=-521;
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
		if (m==ans)
		{
			if (ans<0)
			{
				System.out.println("false");
			}
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}

	}

}
