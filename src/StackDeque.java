import java.util.ArrayDeque;

public class StackDeque<E> extends Stack<E> {
    private ArrayDeque<E> deque;
    private int top;
    private static String className = "ArrayStack";

    public StackDeque() {
        deque = new ArrayDeque<>();
        top = -1;
    }

    @Override
    public E push(E element) {
        deque.addLast(element);
        top++;
        return element;
    }

    public E pop() {
        if (isEmpty()) {
            return null;
        }
        top--;
        return deque.removeLast();
    }

    public E top() {
        if (isEmpty()) {
            return null;
        }
        return deque.getLast();
    }

    public int size() {
        return top + 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == deque.size() - 1;
    }

    public void reverse() {
        Stack<E> buffer = new StackArray<>();
        for (int i = 0; i < deque.size(); i++)
            buffer.push(deque.removeFirst());
        for (int i = 0; i < deque.size(); i++)
            deque.addFirst(buffer.pop());
    }

    // method to clearAllElements
    public void clear() {
        if (top == -1) {
            System.out.println(String.format("%s is already empty", className));
            return;
        }
        deque.clear();
    }
}
