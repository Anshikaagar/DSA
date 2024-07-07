package june18;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		System.out.println(fact(5));

	}

	private static int fact(int n) {
		// TODO Auto-generated method stub
		if (n==0 || n==1)
		{
			return 1;
		}
		int sp=fact(n-1);
		int ans=n*sp;
		return ans;
		
		
	}

}
