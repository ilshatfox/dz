

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<SimpleStudent> list =
                SuperBestAwesomeFramework.getMany(SimpleStudent.class, 100, "John", 18);
        System.out.println(list);
    }

}
