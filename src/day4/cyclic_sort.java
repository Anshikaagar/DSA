package day4;
import java.util.Arrays;
public class cyclic_sort {
	public static void main(String[] args) {
		int [] arr = {6,1,5,4,3,2};
		for (int i=0; i<arr.length; i++)
		{
			while (arr[i]!=i+1)
			{
				int idx = arr[i]-1;
				swap(arr, i , idx);
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	private static void swap(int[] arr, int p1, int p2) {
		int temp = arr[p1];
		arr[p1] = arr[p2];
		arr[p2] = temp;	
	}
}
