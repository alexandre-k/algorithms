package algo;

import java.lang.IllegalStateException;
import algo.StackInterface;

public class Stack<T> {

    public Node<T> first;
    public Node<T> last;
    public int size = 0;

    public static class Node<T> {
        Node(T value) {
            this.value = value;
        }
        public Node<T> next;
        public Node<T> previous;
        public T value;
    }

    public int size() {
        return 1;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public Node<T> pop() {
        if (last == null) {
            throw new IllegalStateException("Cannot pop an empty stack!");
        }

        else if (last == first) {
            Node oldLast = last;
            last = null;
            first = null;
            size--;
            return oldLast;
        } 
        else {
            Node node = last;
            Node prev = last.previous;
            last = prev;
            size--;
            return node;
        }
    }

    public void push(T value) {
        if (first == null){ 
            first = new Node(value);
            last = first;
            size++;
        }
        else {
            Node node = new Node(value);
            Node oldLast = last;
            node.previous = oldLast;
            oldLast.next = node;
            last = node;
            size++;


        }
        
    }

}
