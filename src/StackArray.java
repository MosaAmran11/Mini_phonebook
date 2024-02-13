//import java.util.Stack;

public class StackArray<E> extends Stack<E> {
    private static final int CAPACITY = 5;
    private E[] stackArray;
    private int top;
    private static String className = "ArrayStack";

    public StackArray() {
        this(CAPACITY);
    }

    public StackArray(int capacity) {
        stackArray = (E[]) new Object[capacity];
        top = -1;
    }

    @Override
    public E push(E element) {
        if (top == stackArray.length - 1)
            // throw new IllegalStateException(String.format("%s is full", className));
            expand();
        stackArray[++top] = element;
        return element;
    }

    public E pop() {
        if (isEmpty()) {
            return null;
        }
        return stackArray[top--];
    }

    public E top() {
        if (isEmpty()) {
            return null;
        }
        return stackArray[top];
    }

    public int size() {
        return top + 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == stackArray.length - 1;
    }

    private void expand() {
        E[] newArray = (E[]) new Object[stackArray.length + 1];
        System.arraycopy(stackArray, 0, newArray, 0, stackArray.length);
        stackArray = newArray;
    }

    private void expand(int increment) {
        if (increment <= 0)
            return;
        E[] newArray = (E[]) new Object[stackArray.length + increment];
        System.arraycopy(stackArray, 0, newArray, 0, stackArray.length);
        stackArray = newArray;
    }

    // method to printAllElements
    public void printAllElements() {
        if (top == -1) {
            System.out.println(String.format("%s is empty", className));
            return;
        }
        System.out.print(String.format("%s elements: ", className));
        for (int i = 0; i <= top; i++) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }

    public void reverse() {
        Stack<E> buffer = new StackArray<>();
        for (int i = 0; i < stackArray.length; i++)
            buffer.push(stackArray[i]);
        for (int i = 0; i < stackArray.length; i++)
            stackArray[i] = buffer.pop();
    }

    // method to clearAllElements
    public void clear() {
        if (top == -1) {
            System.out.println(String.format("%s is already empty", className));
            return;
        }
        for (int i = 0; i < stackArray.length; i++) {
            stackArray[i] = null;
        }
        top = -1;
        System.out.println(String.format("%s has been cleared", className));
    }
}
