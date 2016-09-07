package Stack;
public interface Stack1<AnyType> {
	
	/** 
	 * This method is used to check if the stack is empty
	 */
	public boolean isEmpty();
	
	/**
	 * The method is used to push an element on to the stack
	 */
	public void push(AnyType e);
	
	/**
	 * The method is used to remove the top element of the stack
	 */
	public AnyType pop();
	
	/** 
	 * This method is used to read the top element off the stack
	 */
	public AnyType peek();

}
