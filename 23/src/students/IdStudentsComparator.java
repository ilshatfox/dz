package students;

import java.util.Comparator;

public class IdStudentsComparator implements Comparator<Students> {
    @Override
    public int compare(Students o1, Students o2) {
        return o1.id - o2.id;
    }

}
