package day1;

public class one {

	public static void main(String[] args) {
//		for (byte i=0; i<=127; i++)
//		{
//			System.out.println(i);
//		}
		
//		int a=123456;
//		String n = Integer.toString(a);
//		System.out.println(n.length());
		int N=22074;
		int c=0;
        int a=N;
        while (a>0)
        {
            int b=a%10;
            if (b!=0 && N%b==0)
            {
                c++;
            }
            a=a/10;
        }
        System.out.println(c);
	}

}
