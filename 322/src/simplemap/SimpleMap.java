package simplemap;

import java.util.ArrayList;



public class SimpleMap<K, V> implements Map<K, V> {
    private ArrayList<Entry> entries;
    private int count;

    public SimpleMap() {
        this.entries = new ArrayList<Entry>();
        this.count = 0;
    }

    @Override
    public void put(K key, V value) {
        for (int i = 0; i < count; i++) {
            if (entries.get(i).key.equals(key)) {
                entries.get(i).value = value;
                return;
            }
        }
        entries.add(count++, new Entry(key, value));
    }

    @Override
    public V get(K key) {
        for (int i = 0; i < count; i++) {
            if (entries.get(i).key.equals(key)) {
                return (V) entries.get(i).value;
            }
        }
        return null;
    }

    public void print() {
        for (int i = 0; i < entries.size(); i++) {
            System.out.println(entries.get(i).key + " " + entries.get(i).value);
        }
    }

}