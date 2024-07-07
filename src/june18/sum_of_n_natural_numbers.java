package june18;

public class sum_of_n_natural_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		System.out.println(sum(n));
	}

	private static int sum(int n) {
		// TODO Auto-generated method stub
		if (n==0)
		{
			return 0;
		}
		int sp = sum(n-1);
		int ans= sp+n;
		return ans;

//		return sum(n-1)+n;
		
	}

}
