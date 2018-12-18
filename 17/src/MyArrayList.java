import java.util.Iterator;

public class MyArrayList<T> implements Iterable<T> {
    private T[] elements;
    private static final int DEFAULT_CAPACITY = 10;
    private int capacity;
    private int count = 0;
    private static final double EXTENSION_COEF = 1.5;

    public MyArrayList() {
        this.elements = (T[]) new Object[10];
        capacity = DEFAULT_CAPACITY;
    }

    public void add(T e) {
        if (capacity == count) {
            grow();
        }
        elements[count++] = e;
    }

    private void grow() {
        int newCapacity = (int) (capacity * EXTENSION_COEF);
        T[] newElements = (T[]) new Object[newCapacity];
        for (int i = 0; i < capacity; i++) {
            newElements[i] = elements[i];
        }
        capacity = newCapacity;
        elements = newElements;
    }


    public T get(int index) {
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException("No such index");
        }
        return elements[index];
    }

    //число элементов в списке
    int size() {
        return count;
    }

    //есть ли в списке такой элемент
    boolean contains(T value) {
        for (int i = 0; i < count; i++) {
            if (elements[i] == value) {
                return true;
            }
        }
        return false;
    }

    //удаление элемента по индекс (со смещением элементов влево)
    void remove(int index) {
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException("Delete Index out of range");
        }
        index = index + 1;
        for (int i = index; i < count; i++) {
            elements[i - 1] = elements[i];
        }
        count = count - 1;
    }

    //возвращает все элементы из списка в виде массива объектов
    T[] toArray() {
        T[] newElem = (T[]) new Object[count];
        for (int i = 0; i < count; i++) {
            newElem[i] = elements[i];
        }
        return newElem;
    }

    //возвращает все элементы из списка в виде массива, тип массива задан заранее
    T[] toArray(T[] list) {
        for (int i = 0; i < count; i++) {
            list[i] = elements[i];
        }
        return list;
    }

    //добавление всех элементов из списка list в данный список(в конец)
    void addAll(MyArrayList<T> list) {
        for (int i = 0; i < list.size(); i++) {
            add(list.get(i));
        }
    }

    //добавление всех элементов из списка list в данный список
    //начиная с позиции index
    void addAll(MyArrayList<T> list, int startPosition) {
        MyArrayList<T> file = new MyArrayList<T>();
        if (startPosition > count) {
            throw new IndexOutOfBoundsException("index:" + startPosition + ", size:" + count);
        }

        for (int i = 0; i < list.size(); i++) {
            file.add(list.get(i));
        }
        // добавили новые элементы в file

        for (int i = startPosition; i < count; i++) {
            file.add(elements[i]);
        }
        // Остатки собрали в file

        for (int i = 0; i < file.size(); i++) {
            int index = startPosition + i;
            if (index < count) {
                elements[index] = file.get(i);
            } else {
                add(file.get(i));
            }
            // Заменили все элементы начиная с startPosition
        }
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
            return elements[currentIndex++];
        }
    }
}