package june18;
import java.util.*;
public class count_subset_equal_to_target {
	static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3,4,5};
		int target = 3;
		subset(arr, target,0);
		System.out.println(count);

	}

	private static void subset(int[] arr, int k, int idx, int sum) {
			if (idx=-1)
			{
				count++;
			}
		for (int i=0; i<arr.length; i++)
		{
			subset(arr, k-arr[i], idx+1);
		}
	}

}
