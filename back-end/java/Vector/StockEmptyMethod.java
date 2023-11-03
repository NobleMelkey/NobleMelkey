package Vector;
import java.util.Stack;
public class StockEmptyMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer>stk=new Stack<>();
		boolean result = stk.empty();
		System.out.println("is the stack empty?"+result);
		 stk.push(78);
		 stk.push(113);
		 stk.push(90);
		 stk.push(120);
		 System.out.println("elements in stack:"+stk);
		 result=stk.empty();
		 System.out.println("is the stack empty?"+result);

	}

}
