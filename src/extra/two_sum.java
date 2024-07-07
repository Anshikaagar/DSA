package extra;
import java.util.*;
public class two_sum {
	public static void main(String[] args) {
		int [] arr = {2,7,11,15};
		int target = 9;
//		int [] ans = {};
//		sum(arr,target,"",0);
		two_sum(arr,target);
	}
	
	public static int[] two_sum(int [] arr, int target)
	{
		String a=sum(arr,target,"",0);
		char[] s = a.toCharArray();
		int [] ans = new int[a.length()];
		for (int i=0; i<ans.length; i++)
		{
			arr[i]=Integer.parseInt(s[i]);
		}
	}
	private static String sum(int[] arr, int target, String ans, int idx) {
		if (target==0)
		{
//			System.out.println(ans);
//			return ans;
			return "0";
			}
		sum(arr, target-arr[idx], ans+idx+" ", idx+1);	
		return ans;
	}

}
