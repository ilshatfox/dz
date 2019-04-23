package tracks;

import java.util.Comparator;

public class StringComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
//        Если o1 больше чем o2 то + иначе -
        for (int i = 0; i < o1.length(); i++) {
            if (o1.charAt(i) != o2.charAt(i)) {
                return (int) o1.charAt(i) - (int) o2.charAt(i);
            }
        }
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }
}
