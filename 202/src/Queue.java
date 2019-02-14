import java.util.Iterator;

public class Queue<T>{
    Node<T> firstNode;
    Node<T> lastNode;
    public void enqueue(T elem){
        Node<T> oldLast = lastNode;
        lastNode = new Node<>();
        lastNode.item = elem;
        if (isEmpty()) {
            firstNode = lastNode;
        } else {
            oldLast.next = lastNode;
        }
    } // добавить вконец
    public Node<T> dequeue() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Вне границ!");
        } else {
            Node<T> oldFirst = firstNode;
            firstNode = oldFirst.next;
            return oldFirst;
        }
    } // добавить получить из начала удалением
    public boolean isEmpty() {
        return firstNode == null;
    }
}