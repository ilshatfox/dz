import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        MyArrayList<String> l = new MyArrayList<String>();
        //l.add(5); не скомпилируется
        l.add("abc");
        l.add("qwerty");
        l.add("xzcvxcv");
        // l.remove(3);
        System.out.println(l.contains("qwertydd"));
        String s = l.get(0);
        MyArrayList<String> l2 = new MyArrayList<>();
        l2.add("sfsd");
        l2.add("tergsdfg");
        l.addAll(l2, 3);
        //classic using iterator of MyArrayList
        Iterator<String> iter = l.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        System.out.println("s1111111111111");

        System.out.println(l.toArray());
        // Object[] file = l.toArray(new String[l.size()]);
        Object[] file = l.toArray();
        System.out.println(file);
        for (int i = 0; i < 3; i++) {
            boolean ffff = true;
            System.out.println(file[i]);
        }

        System.out.println("s1111111111111");

//        MyArrayList<String> l3 = new MyArrayList<String>();
//        //l.add(5); не скомпилируется
//        l3.add("abc");
//        l3.add("qwerty");
//        l3.add("xzcvxcv");
//        // l.remove(3);
//        //String s = l.get(0);
//        MyArrayList<String> l4 = new MyArrayList<>();
//        l4.add("sfsd");
//        l4.add("tergsdfg");
//        l3.addAll(l4, 1);
//        //classic using iterator of MyArrayList
//        Iterator<String> iter4 = l3.iterator();
//        while (iter4.hasNext()) {
//            System.out.println(iter4.next());
//        }

//        //foreach using iterator
//        for(String str : l) {
//            System.out.println(str.toUpperCase());
//        }

    }
}