
public class StackExample<AnyType> {
	public static void main(String args[]){
		Stack<String> stack= new Stack<String>();
		stack.push("Stack");
		stack.push("Implementation");
		System.out.println("1 Peek "+stack.peek());
		System.out.println(stack.top);
		System.out.println("1 Pop "+stack.pop());
		System.out.println(stack.top);
		System.out.println("2 Peek "+stack.peek());
		System.out.println(stack.top);
		System.out.println("2 Pop "+stack.pop());
		System.out.println(stack.top);
		System.out.println("3 Pop "+stack.pop());
	}
	
	/* 
	 * Expected Output:
	 * 1 Peek Implementation
	   Number of elements: 2

	   1 Pop Implementation
	   Number of elements: 1

	   2 Peek Stack
	   Number of elements: 1

	   2 Pop Stack
	   Number of elements: 0

	   Pop on an empty stack
	   Pop on an empty stack
	 */
}
