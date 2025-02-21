// Stack.java
public interface Stack<T> {
    void push(T item) throws StackOverflowException;  // Add an item to the stack
    T pop() throws StackUnderflowException;          // Remove and return the top item
    T peek() throws StackUnderflowException;         // Return the top item without removing
    boolean isEmpty();                               // Check if the stack is empty
    boolean isFull();                                // Check if the stack is full
}
