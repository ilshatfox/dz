import java.util.Iterator;

public class GenerikNode<T> implements Iterable<T>{
    private T value;
    private GenerikNode<T> next;

    public T getValue() {
        // System.out.println();
        return value;
    }

    public void setValue(T value) {

        this.value = value;
    }

    public GenerikNode<T> getNext() {

        return next;
    }

    public void setNext(GenerikNode<T> next) {

        this.next = next;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}