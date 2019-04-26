package students;

import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {
//    Students a = new Students(1, "a", "q");
    public static void main(String[] args) {
        Students a1 = new Students(2, "a1", "9q1");
        Students a2 = new Students(3, "a2", "8q2");
        Students a3 = new Students(4, "a3", "7q3");
        Students a4 = new Students(5, "a4", "6q4");
        Students a5 = new Students(6, "a5", "5q5");
        Students a6 = new Students(7, "a6", "4q6");
        Students a7 = new Students(8, "a7", "3q7");
        Students a8 = new Students(9, "a8", "2q8");
        Students a9 = new Students(10, "a9", "1q9");

//        StringComparator strComp = new StringComparator();
//        IdStudentsComparator idComp = new IdStudentsComparator();
//        NameStudentsComparator nameComp = new NameStudentsComparator(strComp);
//        SecondNameStudentsComparator secondComp = new SecondNameStudentsComparator(strComp);

        class lambdaIdComp implements Comparator<Students> {
            @Override
            public int compare(Students o1, Students o2) {
                return o1.id - o2.id;
            }
        }

        class lambdaNameComp implements Comparator<Students> {
            @Override
            public int compare(Students o1, Students o2) {
                StringComparator strComp = new StringComparator();
                return strComp.compare(o1.name, o2.name);
            }
        }

        class lambdaNameStudentsComp implements Comparator<Students> {
            @Override
            public int compare(Students o1, Students o2) {
                StringComparator strComp = new StringComparator();
                return strComp.compare(o1.secondName, o2.secondName);
            }
        }


        Comparator<Students> idComp = (Students s1, Students s2) -> s1.id - s2.id;

        Comparator<Students> nameComp = (Students s1, Students s2) -> {
            StringComparator strComp = new StringComparator();
            return strComp.compare(s1.name, s2.name);
        };
        Comparator<Students> secondNameComp = (Students s1, Students s2) -> {
            StringComparator strC = new StringComparator();
            return strC.compare(s1.secondName, s2.secondName);
        };

        // лямбда выражения
//        SortedStudentGroup ssg = new SortedStudentGroup(idComp);
//        SortedStudentGroup ssg = new SortedStudentGroup(nameComp);
        SortedStudentGroup ssg = new SortedStudentGroup(secondNameComp);

        // Анонимные классы
//        SortedStudentGroup ssg = new SortedStudentGroup(new lambdaNameStudentsComp());
//        SortedStudentGroup ssg = new SortedStudentGroup(new lambdaIdComp());
//        SortedStudentGroup ssg = new SortedStudentGroup(new lambdaNameComp());

        ssg.add(a1);
        ssg.add(a2);
        ssg.add(a9);
        ssg.add(a8);
        ssg.add(a7);
        ssg.add(a6);
        ssg.print();
    }
}
