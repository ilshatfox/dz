import mystream.MyList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        List<String> list = new ArrayList<>();
//        list.add("abc");
//        list.add("abcadsf");
//        list.add("eruer");
//        list.add("qwroi");

        MyList<String> ll = new MyList<>();
        ll.add("abc");
        ll.add("abcadsf");
        ll.add("eruer");
        ll.add("qwroi");

//        ll.stream().forEach(s -> System.out.println(s));

        ll.stream().map(s -> s.length()).forEach(s -> System.out.println(s));
//        ll.stream().filter(s -> s.charAt(1) != 'b').forEach(s -> System.out.println(s));
//        ll.stream().forEach(s -> System.out.println(s));
//        ll.stream().filter(s -> s.charAt(0) == 'a' || s.charAt(0) == 'e').forEach(s -> System.out.println(s));
//        ll.stream().map(s -> s.length()).forEach(s -> System.out.println(s));
    }
}