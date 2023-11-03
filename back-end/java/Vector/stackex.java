package Vector;
import java.util.EmptyStackException;
import java.util.Stack;
public class stackex {
	static void pushelmnt(Stack<Integer> stk,int x)
	{
		stk.push(x);
		System.out.println("push ->"+x);
		System.out.println("stack:"+stk);
	}
	static void popelmnt(Stack<Integer> stk)
	{
		System.out.println("pop ->");
		Integer x=(Integer)stk.pop();
		System.out.println(x);
		System.out.println("stack:"+stk);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stk=new Stack<Integer>();
		System.out.println("stack:"+stk);
		try
		{
			popelmnt(stk);
		
		}
		catch(EmptyStackException e) {
			System.out.println("empty");
		}
		pushelmnt(stk, 20);
		pushelmnt(stk, 13);
		pushelmnt(stk, 89);
		pushelmnt(stk, 90);
		pushelmnt(stk, 11);
		pushelmnt(stk, 45);
		pushelmnt(stk, 18);
		popelmnt(stk);
		popelmnt(stk);
		
		System.out.println(stk.peek());
		int loc=stk.search(13);
        System.out.println("location:"+loc);

	}

}
