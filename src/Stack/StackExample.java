package Stack;

public class StackExample<AnyType> {
	public static void main(String args[]){
		Stack<String> stack= new Stack<String>();
		stack.push("Stack");
		stack.push("Implementation");
		System.out.println("1 Peek "+stack.peek());
		System.out.println("Number of elements: " + (stack.top+1));
		System.out.println();
		System.out.println("1 Pop "+stack.pop());
		System.out.println("Number of elements: " + (stack.top+1));
		System.out.println();
		System.out.println("2 Peek "+stack.peek());
		System.out.println("Number of elements: " + (stack.top+1));
		System.out.println();
		System.out.println("2 Pop "+stack.pop());
		System.out.println("Number of elements: " + (stack.top+1));
		System.out.println();
		System.out.println(stack.pop());
		System.out.println(stack.peek());
	}
}
