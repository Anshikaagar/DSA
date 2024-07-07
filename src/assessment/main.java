package assessment;
import java.util.*;
public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		for (int i=0; i<n; i++)
		{
			arr[i]= sc.nextInt();
		}
		find(arr);	
	}
	private static void find(int[] arr) {
		ArrayList<Integer> list = new ArrayList<>();
		int ans=-1;
		for (int i=0; i<arr.length; i++)
		{
			int idx = Math.abs(arr[i])-1;
			if (arr[idx]>0)
			{
				arr[idx]*=-1;
			}
			else
			{
				list.add(idx+1);			
			}
		}
		Collections.sort(list);
		for (int i=0; i<list.size(); i++){
			System.out.print(list.get(i)+" ");
		}
	}
}
