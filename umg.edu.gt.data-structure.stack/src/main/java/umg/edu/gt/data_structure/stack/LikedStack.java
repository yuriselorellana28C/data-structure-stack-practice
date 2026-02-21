package umg.edu.gt.data_structure.stack;

public class LikedStack {
    private Node top;

    public LikedStack() {
        this.top = null;
    }

    public void push(char value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }

    public char pop() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        char value = top.value;
        top = top.next;
        return value;
    }

    public char peek() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return top.value;
    }

    public boolean isEmpty() {
        return top == null;
    }
}