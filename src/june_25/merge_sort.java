package june_25;
import java.util.*;
public class merge_sort {
	public static void main(String[] args) {
		int [] arr = {1,2,5};
//		int [] brr = {1,2,3,5};
		int [] ans= merge(arr,0,arr.length-1);
		System.out.println(Arrays.toString(ans));

	}
	private static int[] merge(int[] arr, int s, int e) 
	{
		if (s==e)
		{
			int [] a = new int[1];
			a[0]=arr[s];
			return a;
		}
		int mid = s+(e-s)/2;
		int [] left = merge(arr,s,mid);
		int [] right = merge(arr, mid+1, e);
//		int [] ans = mergesorted(left,right);
//		return ans;	
		return mergesorted(left,right);
	}
	private static int[] mergesorted(int[] arr, int[] brr) {
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
