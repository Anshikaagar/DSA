package june_25;
import java.util.*;
import java.math.BigInteger;
public class additive_number {
	public static void main(String[] args) {
		String num = "199100199";
		if(isAdditiveNumber(num))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}

	}
	public static boolean isAdditiveNumber(String num) {
        return isAdditive(num, new ArrayList<>());
        
    }
    public static boolean isAdditive(String num, ArrayList<BigInteger> list)
    {
        if (num.length()==0)
        {
            return list.size()>=3;
        }

        for (int i=1; i<num.length(); i++)
        {
            String partition = num.substring(0,i);
            String remain = num.substring(i);
            if (isvalidpartition(list, partition))
            {
                int cur = Integer.parseInt(partition);
                list.add(cur);
                boolean isvalid = isAdditive(remain,list);
                if (isvalid)
                {
                    return true;
                }
                list.remove(list.size()-1);
            }
        }
        return false;
    }
    public static boolean startzero(String curr)
    {
    	if (curr.charAt(0)=='0')
    	{
    		return false;
    	}
    	return curr.charAt(0)!='0';
    }
    public static boolean isvalidpartition(ArrayList<BigInteger> list, String curr)
    {
        if (list.size()<2)
        {
            return true;
        }
        BigInteger last=list.get(list.size()-1);
        BigInteger sec_last = list.get(list.size()-2);
        BigInteger cur = Integer.parseInt(curr);
        return cur == last + sec_last;
    }
	

}
