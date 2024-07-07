package june_24;

public class word_search {

	public static void main(String[] args) {
		char[][] board ={{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
		String word = "SEE";	
		boolean ans= exist(board, word);
		System.out.println(ans);

	}
	public static boolean exist(char [][]board, String word)
	{
		for (int i=0; i<board.length; i++)
		{
			for (int j=0; j<board[0].length; j++)
			{
				if (word.charAt(0)==board[i][j])
				{
					boolean is = isPresent(board, word, i, j ,0);
					if (is)
					{
						return true;
					}
				}
			}
		}
		return false;
	}
	public static boolean isPresent(char[][] board, String word, int i, int j, int index)
	{
		if (index==word.length()-1)
		{
			return true;
		}
		if (i==-1 || j==-1 || i==board.length || j==board[0].length || board[i][j]=='&' || board[i][j]!=word.charAt(index))
		{
			return false;
		}
		
		int [] row = {-1, 0, 1, 0};
		int [] col = {0, 1, 0, -1};
		
		char temp = board[i][j];
		board[i][j]='&';
		
		for (int k=0; k<row.length; k++)
		{
			boolean ans = isPresent(board, word, i+row[k], j+col[k], index+1);
			if(ans)
			{
				return true;
			}
		}
		board[i][j]=temp;
		return false;
	}
}
