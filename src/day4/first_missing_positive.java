package day4;
public class first_missing_positive {
	public static void main(String[] args) {
		int [] arr = {1,2,0};
		

	}
	public static int first(int[] arr) {
		boolean isonepresent=false;
		for (int i=0; i<arr.length; i++)
		{
			if (arr[i]<=0 || arr[i]>arr.length) 
			{
				isonepresent=true;
			}
			else if
			{
				
			}
		}
		
		
		
		int ans=0;
		for (int i=0; i<arr.length; i++)
		{
			if (arr[i]>0)
			{
				ans = i+1;
				break;
			}
		}
		return ans == 0 ? arr.length+1 : ans;	    
    }
}

