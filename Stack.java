
/**
 * 
 * @author Ragav Ramakrishnan
 * Implementing the Stack Data Structure using Array 
 */

public class Stack<AnyType> implements Stack1<AnyType> {
	
	int top = -1;
	AnyType[] stackArray = (AnyType[]) new Object[50];

	/**
	 * The method is used to push an element on to the stack
	 */
	public void push(AnyType e){
		if(top==49){
			System.out.println("The stack is full, please delete elemets to add elements");
		} else{
			stackArray[++top] = e;
		}	
	}
	
	/** 
	 * This method is used to check if the stack is empty
	 */
	public boolean isEmpty(){
		if(top==-1){
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * The method is used to remove the top element of the stack
	 */
	public AnyType pop(){
		if(top==-1){
			System.out.println("The stack is empty");
		}
		AnyType x = peek();
		stackArray[top] = null;
		top--;
		return x;
	}
	
	/** 
	 * This method is used to read the top element off the stack
	 */
	public AnyType peek(){
		if(top==-1){
			System.out.println("The stack is empty");
		} 
		return stackArray[top];
	}
	
}
