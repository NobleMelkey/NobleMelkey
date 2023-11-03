package Assessment4;


import java.util.*;

public class Stackexam {
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
		pushelmnt(stk, 1);
		pushelmnt(stk, 2);
		pushelmnt(stk, 3);
		pushelmnt(stk, 4);
		pushelmnt(stk, 5);
		pushelmnt(stk, 6);
		pushelmnt(stk, 7);
		popelmnt(stk);
		popelmnt(stk);
		
		System.out.println(stk.peek());
		int loc=stk.search(5);
        System.out.println("location:"+loc);


	}

}
