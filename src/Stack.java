import java.util.EmptyStackException;
import java.util.Vector;

public abstract class Stack<E> extends Vector<E> {
    /**
     * Returns the number of elements in the stack.
     * 
     * @return number of elements in the stack
     */
    // int size();

    /**
     * Tests if this stack is empty.
     *
     * @return {@code true} if and only if this stack contains
     *         no items; {@code false} otherwise.
     */
    public boolean isEmpty() {
        return size() == 0;
    }

    /**
     * Looks at the object at the top of this stack without removing it
     * from the stack.
     *
     * @return the object at the top of this stack (the last item
     *         of the {@code Vector} object).
     * @throws EmptyStackException if this stack is empty.
     */
    public E peek() {
        int len = size();

        if (len == 0)
            throw new EmptyStackException();
        return elementAt(len - 1);
    }

    /**
     * Inserts an element at the top of the stack.
     * 
     * @param element the element to be inserted
     */
    public E push(E element) {
        addElement(element);

        return element;
    }

    /**
     * Returns the element at the top of the stack.
     * 
     * @return top element in the stack (or null if empty)
     */
    abstract E top();

    /**
     * Removes and returns the top element from the stack.
     * 
     * @return element removed (or null if empty)
     */
    public E pop() {
        E obj;
        int len = size();

        obj = peek();
        removeElementAt(len - 1);

        return obj;
    }

    /**
     * Check if Stack is full
     * 
     * @return Return true if Stack is full, otherwise false
     */
    abstract boolean isFull();

    /**
     * Reverse the current Stack
     */
    abstract void reverse();
}
