package assessment;
import java.util.*;
public class main1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		inverse(n);	
	}
	public static void inverse(int n) {
		int ans=0;
		int pos=1;
		while (n>0)
		{
			int a = n%10;
			ans+=pos*Math.pow(10, a-1);
			n=n/10;
			pos++;
		}
		System.out.println(ans);	
	}
}
