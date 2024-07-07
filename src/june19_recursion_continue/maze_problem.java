package june19_recursion_continue;
import java.util.*;
public class maze_problem {
	public static void main(String[] args) {
		maze(0,0,3, "");
		
	}
	public static void maze(int i, int j, int des, String ans)
	{
//		base condition
		if (i==des-1 && j==des-1)
		{
			System.out.println(ans);
			return;
		}
		
//		boundary condition
		if (i==des || j==des)
		{
			return;
		}
		
		maze(i+1, j, des, ans+"D ");
		maze(i, j+1, des, ans+"R ");
	}

}
