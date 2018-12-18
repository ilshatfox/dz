import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add(1);
        a.add(2);
        a.add(3);
        ArrayList a2 = new ArrayList();
        a2.add(5);
        a2.add(6);
        a2.add(7);
        a.addAll(4, a2);
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
        System.out.println("dfsdf");
        IntArrayList a3 = new IntArrayList();
        a3.add(1);
        a3.add(0);
        IntArrayList a4 = new IntArrayList();
        a4.add(5);
        a4.add(6);
        a4.add(7);
        a4.add(9);
        a4.add(10);
        a4.addAll(a3, 2);
        //a4.remove(3);
        for (int i = 0; i < a4.size(); i++) {
            System.out.println(a4.get(i));
        }
        System.out.println("dfsdf");
        //a.size();
        IntList list2 = new IntArrayList();
        list2.add(49);
        list2.add(48);
        list2.add(47);//{43, 44, 45
        //list2.remove(1);
        list2.add(1);
//        System.out.println(list2.get(0));
//        System.out.println(list2.get(1));
//        System.out.println(list2.get(2));
//        System.out.println(list2.get(3));
        System.out.println(list2.toArray().length);
        list2.sort();
        int[] file = new int[4];
        file[0] = 1;
        System.out.println(file);
//        System.out.println(list2.get(0));
//        System.out.println(list2.get(1));
//        System.out.println(list2.get(2));
//        System.out.println(list2.get(3));
    }
}