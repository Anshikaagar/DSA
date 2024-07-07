package june_25;
import java.util.Arrays;
public class merge_two_sorted_arrays {
	public static void main(String[] args) {
		int [] arr = {1,2,5};
		int [] brr = {1,2,3,5};
		int [] ans= merge(arr, brr);
		System.out.println(Arrays.toString(ans));

	}
	public static int[] merge(int []arr , int []brr)
	{
		int i=0;
		int j=0;
		int k=0;
		int [] ans = new int[arr.length + brr.length];
		while (i<arr.length && j<brr.length) 
		{
			if (arr[i]<brr[j])
			{
				ans[k]=arr[i];
				i++;
				k++;
			}
			else
			{
				ans[k]=brr[j];
				j++;
				k++;
			}
		}
		while (i<arr.length) {
			ans[k]=arr[i];
			i++;
			k++;
		}
		while (j<brr.length) {
			ans[k]=brr[j];
			j++;
			k++;
		}
		return ans;
	}

}
