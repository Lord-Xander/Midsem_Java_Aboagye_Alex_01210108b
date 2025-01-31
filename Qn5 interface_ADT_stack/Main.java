// Interface
interface StackADT<T> {
    void push(T item);
    T pop();
    T peek();
    boolean isEmpty();
    boolean isFull();
    int size();
}

// Implementation
class ArrayStack<T> implements StackADT<T> {
    private T[] stack;
    private int top;
    private int capacity;

    @SuppressWarnings("unchecked")
    public ArrayStack(int capacity) {
        this.capacity = capacity;
        this.stack = (T[]) new Object[capacity];
        this.top = -1;
    }

    @Override
    public void push(T item) {
        if (isFull()) {
            throw new StackOverflowError("Stack is full");
        }
        stack[++top] = item;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return stack[top--];
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return stack[top];
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public boolean isFull() {
        return top == capacity - 1;
    }

    @Override
    public int size() {
        return top + 1;
    }
}

// Testing the Stack
class StackTest {
    public static void main(String[] args) {
        ArrayStack<Integer> stack = new ArrayStack<>(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Popped: " + stack.pop()); // Expected: 30
        System.out.println("Top element: " + stack.peek()); // Expected: 20
    }
}
