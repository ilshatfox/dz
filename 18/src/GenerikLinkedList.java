import java.util.Iterator;

public class GenerikLinkedList<T> implements Iterable<T> {
    private GenerikNode<T> head;
    private int count = 0;

    //добавление в конец

    public int size() {
        return count;
    } // Готово

    boolean contains(T value) { // Готово
        GenerikNode current = head;
        if (current.getValue().equals(value)) {
            return true;
        }
        while (current.getNext() != null) {
            current = current.getNext();
            if (current.getValue().equals(value)) {
                return true;
            }
        }
        return false;
    }

    //возвращает все элементы из списка в виде массива
    public T[] toArray() {
        T[] newElem = (T[]) new Object[count];
        GenerikNode<T> current = head;
        int i = 0;
        newElem[i] = current.getValue();
        while (current.getNext() != null) {
            i += 1;
            current = current.getNext();
            newElem[i] = current.getValue();
        }
        return newElem;
    }

    public void add(T e) {
        GenerikNode<T> newNode = new GenerikNode<T>();
        newNode.setValue(e);
        newNode.setNext(null);
        if (head != null) {
            GenerikNode current = head;
            //по итогу цикла в current записана ссылка на последнюю Ноду
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        } else {
            head = newNode;
        }
        count++;
    }


    void addAll(GenerikLinkedList<T> list) { // Не сделано 3
        for (int i = 0; i < list.size(); i++) {
            // System.out.println(get(i));
            add(list.get(i));
        }
    }

//    void addAll(GenerikLinkedList<T> list, int index) { // Не сделано 3
//        if (index < 0 || index > count) {
//            throw new IndexOutOfBoundsException("Index: " + index + " вне границ");
//        }
//
//        if (index == count) {
//            addAll(list);
//            return;
//        }
//        T[] arr = list.toArray();
//
//
//
//        GenerikNode<T> curr = head;
//        for (int i = 0; i < index - 1; i++) {
//            curr = curr.getNext();
//        }
//
//        GenerikNode<T> next = curr.getNext();
//
//        for (int i = 0; i < arr.length; i++) {
//            GenerikNode<T> newnode = new GenerikNode<>();
//            newnode.setValue(arr[i]);
//            curr.setNext(newnode);
//            curr = curr.getNext();
//            count++;
//        }
//        curr.setNext(next);
//    }

//    //добавление всех элементов из списка list в данный список
//    //начиная с позиции index
    void addAll(GenerikLinkedList<T> list, int startPosition) { // Не сделано 4
        GenerikLinkedList<T> file = new GenerikLinkedList<T>();
        if (startPosition > count) {
            throw new IndexOutOfBoundsException("index:" + startPosition + ", size:" + count);
        }

        for (int i = 0; i < list.size(); i++) {
            file.add(list.get(i));
        }
        // добавили новые элементы в file
        for (int i = startPosition; i < count; i++) {
            file.add(get(i));
        }
        // Остатки собрали в file

        for (int i = 0; i < file.size(); i++) {
            int index = startPosition + i;
            if (index < count) {
                setValue(index, file.get(i));
            } else {
                add(file.get(i));
            }
            // Заменили все элементы начиная с startPosition
        }
    }

    public T get(int index) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException("Index: " + index + " вне границ");
        }
        GenerikNode<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current.getValue();
    }

    public void setValue(int index, T newValue) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException("Index: " + index + " вне границ");
        }
        GenerikNode<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        current.setValue(newValue);
    }


    public void remove(int index) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException("Index: " + index + " вне границ");
        }
        if (index == 0) {
            head = head.getNext();
        } else {
            GenerikNode<T> beforeRemovable = head;
            for (int i = 0; i < index - 1; i++) {
                beforeRemovable = beforeRemovable.getNext();
            }
            GenerikNode<T> nodeToRemove = beforeRemovable.getNext();
            beforeRemovable.setNext(nodeToRemove.getNext());
        }
        count--;
    }

    public Iterator<T> iterator() {
        return new MyIter();
    }

    public class MyIter implements Iterator<T> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < count;
        }

        @Override
        public T next() {

            return null;
        }
    }
}