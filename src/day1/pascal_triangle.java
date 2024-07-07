package day1;

public class pascal_triangle {

	public static void main(String[] args) {
		int N=5;
		for (int n=0; n<N; n++)
		{
			int ncr=1;
			for (int r=0; r<=n; r++)
			{
//				int ncr = fact(n)/(fact(r)*fact(n-r));
				System.out.print(ncr+" ");
				ncr = ((n-r)*ncr)/(r+1);
			}
//			System.out.print(ncr+" ");
			System.out.println();
		}
//		int a = fact(n);
//		System.out.println(a);
		
	}
	public static int fact(int n)
	{
		int f=1;
		for (int i=1; i<=n; i++)
		{
			f=f*i;
		}
		return f;
	}

}
