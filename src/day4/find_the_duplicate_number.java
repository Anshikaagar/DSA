package day4;

public class find_the_duplicate_number {

	public static void main(String[] args) {
		int [] arr = {1,3,4,2,2};
		find(arr);
	}
	public static void find(int [] arr)
	{
		int ans=-1;
		for (int i=0; i<arr.length; i++)
		{
			int idx = Math.abs(arr[i])-1;
			if (arr[idx]<0)
			{
				ans=idx+1;
			}
			else
			{
				arr[idx]*=-1;
			}
		}
		System.out.println(ans);
	}

}
