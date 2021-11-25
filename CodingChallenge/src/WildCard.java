

	import java.util.Scanner;
	import java.util.Stack;
	class WildCard
	{
	    public static void main(String[] args)
	    {
	        Scanner sr = new Scanner(System.in);
	        String s = sr.next();
	        Stack<String> stack = new Stack();
	        stack.push(s);        
	        int index;
	        while(!stack.empty())
	        {
	            String curr = stack.pop();
	            if((index = curr.indexOf('?')) != -1)
	            {
	                for (char ch = '0'; ch <= '1'; ch++)
	                {
	                    curr = curr.substring(0, index) + ch +
	                            curr.substring(index + 1);
	                    stack.push(curr);
	                }
	            }
	            else
	                System.out.println(curr);
	        }
	    }
	}

