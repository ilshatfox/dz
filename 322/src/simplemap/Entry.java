package simplemap;

public class Entry<I, E> {
    I key;
    E value;

    public Entry(I key, E value) {
        this.key = key;
        this.value = value;
    }
}
