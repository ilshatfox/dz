import java.awt.event.FocusAdapter;
import java.util.Arrays;

public class IntArrayList implements IntList {
    private int[] elements;
    private static final int DEFAULT_CAPACITY = 10;
    private int capacity;
    private int count = 0;
    private static final double EXTENSION_COEF = 1.5;

    public IntArrayList() {
        elements = new int[DEFAULT_CAPACITY];
        capacity = DEFAULT_CAPACITY;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean contains(int e) {
        for (int i = 0; i < count; i++) {
            if (elements[i] == e) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void add(int e) {
        if (capacity == count) {
            grow();
        }
        elements[count++] = e;
    }

    private void grow() {
        int newCapacity = (int) (capacity * EXTENSION_COEF);
        int[] newElements = new int[newCapacity];
        for (int i = 0; i < capacity; i++) {
            newElements[i] = elements[i];
        }
        capacity = newCapacity;
        elements = newElements;
    }

    @Override
    public int get(int index) {
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException("No such index");
        }
        return elements[index];
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException("Delete Index out of range");
        }
        index = index + 1;
        for (int i = index; i < count; i++) {
            elements[i - 1] = elements[i];
        }
        count = count - 1;
    }

    @Override
    public void sort() {
        for (int i = 0; i < count - 1; i++)
            for (int j = 0; j < count - i - 1; j++)
                if (elements[j] > elements[j + 1]) {
                    int t = elements[j];
                    elements[j] = elements[j + 1];
                    elements[j + 1] = t;
                }
    }

    @Override
    public void addAll(IntList intList) {
        for (int i = 0; i < intList.size(); i++) {
            add(intList.get(i));
        }
    }

    @Override
    public void addAll(IntList intList, int startPosition) {
        IntArrayList file = new IntArrayList();
        if (startPosition > count) {
            throw new IndexOutOfBoundsException("index:" + startPosition + ", size:" + count);
        }

        for (int i = 0; i < intList.size(); i++) {
            file.add(intList.get(i));
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

    @Override
    public int[] toArray() {
        int[] elem = new int[count];
        for (int i = 0; i < count; i++) {
            elem[i] = elements[i];
        }
        return elem;
    }

    @Override
    public int indexOf(int value) {
        for (int i = 0; i < count; i++) {
            if (elements[i] == value) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void set(int index, int newInt) {
        elements[index] = newInt;
    }
}