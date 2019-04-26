package students;

import java.util.Comparator;

public class SecondNameStudentsComparator implements Comparator<Students> {

    StringComparator comp;

    public SecondNameStudentsComparator(StringComparator comp) {
        this.comp = comp;
    }

    @Override
    public int compare(Students o1, Students o2) {
        return comp.compare(o1.secondName, o2.secondName);
    }

//    @Override

}
