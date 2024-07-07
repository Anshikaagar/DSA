package june_26;
import java.util.*;
public class quick_sort {
	public static void main(String[] args) {
		int [] arr = {5,9,4,8,1,3,6};
//		placeatcorrectindex(arr,0,arr.length-1);
		quicksort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	public static void quicksort(int []arr, int s, int e)
	{
		if (s>=e)
		{
			return;
		}
		int idx = placeatcorrectindex(arr,s ,e);
		quicksort(arr, s , idx-1);
		quicksort(arr, idx+1, e);
		
	}
	public static int placeatcorrectindex(int [] arr, int s, int e)
	{
		int a = arr[e];
		int pos=s;
		for (int i=s; i<e; i++)
		{
			if (arr[i]<a)
			{
				swap(arr, i, pos);
				pos++;
			}
		}
		swap(arr, pos, e);
//		System.out.println(Arrays.toString(arr));
		return pos;
	}
	private static void swap(int []arr,int a, int b) {
		int temp = arr[a];
		arr[a]=arr[b];
		arr[b]=temp;	
	}
}
