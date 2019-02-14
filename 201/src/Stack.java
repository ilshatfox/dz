import java.util.Iterator;

public class Stack<T>{
    Node<T> lastElem;

    public void push(Node<T> elem){
        elem.next = lastElem;
        lastElem = elem;
    }
    public Node<T> pop() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("lastElem: вне границ");
        } else {
            Node<T> oldLast = lastElem;
            lastElem = oldLast.next;
            return oldLast;
        }
    }
    public boolean isEmpty() {
        return lastElem == null;
    }
}