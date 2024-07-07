package june19_recursion_continue;

public class subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abc";
		subsequence(str, "");

	}

	private static void subsequence(String str, String ans) {
		// TODO Auto-generated method stub
		if (str.length()==0)
		{
			System.out.println(ans+" ");
			return;
		}
		subsequence(str.substring(1), ans+str.charAt(0));
		subsequence(str.substring(1), ans);
		
	}

}
