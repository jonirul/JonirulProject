package stack;
import java.util.Stack;
public class StackDemo {
	public static void printMe(Stack<String> s) {
		if(s.isEmpty())
			System.out.println("you have nothing in your stack");
		else
			System.out.printf("%s TOP\n", s);
	}
	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<String>();
		printMe(stack);
		stack.push("Apple");
		printMe(stack);
		stack.push("Banana");
		printMe(stack);
		stack.push("Lemon");
		printMe(stack);
		
		
		stack.pop();
		printMe(stack);
		stack.pop();
		printMe(stack);
		stack.pop();
		printMe(stack);
		
	}

}
