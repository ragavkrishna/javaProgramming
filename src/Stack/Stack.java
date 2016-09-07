package Stack;
/**
 * 
 * @author Ragav Ramakrishnan
 * Implementing the Stack Data Structure using Array 
 */

public class Stack<AnyType> implements Stack1<AnyType> {
	
	int top = -1;
	AnyType[] stackArray = (AnyType[]) new Object[50];
	
	public boolean isEmpty(){
		if(top==-1){
			System.out.print("Stack is empty, please add elements!");
			return true;
		}
	    return false;
	}
	
	public void push(AnyType e){
		if(top==49){
			System.out.println("The stack is full, please pop elements or resize the stack");
		}
		stackArray[++top] = e;
	}
	
	@SuppressWarnings("unchecked")
	public AnyType pop(){
		if(top==-1){
			return (AnyType) "Pop on an empty stack";
		} else {
			AnyType e = peek();
			stackArray[top--] = null;
			return e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public AnyType peek(){
		if(top==-1){
			return (AnyType) "Pop on an empty stack";
		} else {
			return stackArray[top];
		}
	}
}
