package students;

import java.util.Comparator;

public class NameStudentsComparator implements Comparator<Students> {
    StringComparator comp;

    public NameStudentsComparator(StringComparator comp) {
        this.comp = comp;
    }

    @Override
    public int compare(Students o1, Students o2) {
        return comp.compare(o1.name, o2.name);
    }
}
