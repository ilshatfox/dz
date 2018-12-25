public class GenerikListTestMain {
    public static void main(String[] args) {
        GenerikLinkedList list = new GenerikLinkedList();
        list.add(3);
        list.add(7);
        list.add(1);
        GenerikLinkedList list2 = new GenerikLinkedList();
        list2.add(4);
        list2.add(5);
        list2.add(6);
        //list.remove(1);
        list.addAll(list2, 3);
        Object[] file = list.toArray();
        for (int i = 0; i < file.length; i++) {
            System.out.println(file[i]);
        }
        // System.out.println(list.contains(1));
        //System.out.println(list.get(1));
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
    }
}