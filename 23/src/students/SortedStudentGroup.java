package students;

import java.util.ArrayList;
import java.util.Comparator;

public class SortedStudentGroup {
    //массив упорядоченных треков
    ArrayList<Students> listOfTracks = new ArrayList<>();

    Comparator<Students> comp;

    public SortedStudentGroup(Comparator<Students> compar) {
        this.comp = compar;

//        if (compareWay.equals("id")) {
//            this.comp = (Comparator) new IdStudentsComparator();
//        } else if (compareWay.equals("name")) {
//
//        } else if (compareWay.equals("second_name")) {
//
//        } else {
//            System.out.println("Не корректное!");
//        }
    }
    //вставляет новый аудиотрек в нужное место согласно порядку
    public void add(Students track) {
        if (listOfTracks.size() == 0) {
            listOfTracks.add(0, track);
        } else {
            boolean addTest = false;
            for (int i = 0; i < listOfTracks.size(); i++) {
                if (comp.compare(track, listOfTracks.get(i)) < 0) {
                    listOfTracks.add(i, track);
                    addTest = true;
                    break;
                }
            }
            if (!addTest) {
                listOfTracks.add(track);
            }
        }
    }

    public void print() {
        System.out.println("lenght " + listOfTracks.size());
        for (int i = 0; i < listOfTracks.size(); i++) {
            listOfTracks.get(i).print();
//            System.out.println(listOfTracks.get(i).duration);
        }
    }
}
