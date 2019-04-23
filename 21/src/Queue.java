public class Queue<T> {
    Node<T> first;
    Node<T> last;

    private boolean isEmpty() {
        if (first == null) {
            return true;
        } else {
            return false;

        }
    }

    void enqueue(T elem) {
        Node<T> oldLast = last;
        last = new Node<>();
        last.item = elem;
        if (isEmpty()) {
            first = last;
        } else {
            oldLast.next = last;
        }
    }

    public Node<T> dequeque() {
        if (!isEmpty()) {
            Node<T> oldFirst = first;
            first = oldFirst.next;

            return first;
        } else {
            throw new IndexOutOfBoundsException("Пустая очередь");
        }
    }
}