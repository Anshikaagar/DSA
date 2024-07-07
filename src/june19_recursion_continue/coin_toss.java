package june19_recursion_continue;
import java.util.*;
public class coin_toss {
	public static void main(String[] args) { 
		int n = 5; 
		toss(n, " ");
	}
	private static void toss(int n, String ans) {
		if (n==0)
		{
			System.out.println(ans);
			return;
		}
		toss(n-1, ans+'H');
		toss(n-1, ans+'T');	
	}
}