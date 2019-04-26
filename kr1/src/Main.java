import java.io.IOException;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        Predicate<String> pred = ((String s) -> s.charAt(0) != 'u');
        List<String> f = findKeys(pred);

        System.out.println(f.toString());

    }

    public static List<String> findKeys(Predicate<String> predicate) throws IOException {
        String file = Reader.read("words.txt");
        String[] f = file.split(" ");

        HashMap<String, Integer> m_file = findKeys2(f);

        ArrayList<Word> arr = new ArrayList<>();
        for (String i : m_file.keySet()) {
            Word w = new Word(i, m_file.get(i));
            arr.add(w);
        }

        Comparator<Word> com = ((s1, s2) -> s2.num - s1.num);
        arr.sort(com);

        List<String> str = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            str.add(arr.get(i).word);
        }
        str = str.stream().filter(predicate).collect(Collectors.toList());

        return str;

    }

    public static HashMap<String, Integer> findKeys2(String[] ff) {
        HashMap<String, Integer> m_file = new HashMap<>();
        for (int i = 0; i < ff.length; i++) {
            Integer num = m_file.get(ff[i]);
            if (num != null) {
                m_file.put(ff[i], num + 1);
            } else {
                m_file.put(ff[i], 1);
            }
        }
        return m_file;
    }

}
