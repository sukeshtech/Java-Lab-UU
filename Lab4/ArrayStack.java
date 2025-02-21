// ArrayStack.java
public class ArrayStack<T> implements Stack<T> {
    private T[] stackArray;    // Array to hold stack elements
    private int top;           // Index of the top element
    private int capacity;      // Maximum capacity of the stack

    @SuppressWarnings("unchecked")
    public ArrayStack(int capacity) {
        this.capacity = capacity;
        this.stackArray = (T[]) new Object[capacity];
        this.top = -1;
    }

    @Override
    public void push(T item) throws StackOverflowException {
        if (isFull()) {
            throw new StackOverflowException("Stack is full! Cannot push " + item);
        }
        stackArray[++top] = item;
    }

    @Override
    public T pop() throws StackUnderflowException {
        if (isEmpty()) {
            throw new StackUnderflowException("Stack is empty! Cannot pop.");
        }
        T item = stackArray[top];
        stackArray[top--] = null;  // Remove reference to the popped element
        return item;
    }

    @Override
    public T peek() throws StackUnderflowException {
        if (isEmpty()) {
            throw new StackUnderflowException("Stack is empty! Cannot peek.");
        }
        return stackArray[top];
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public boolean isFull() {
        return top == capacity - 1;
    }

    public int size() {
        return top + 1;
    }
}
