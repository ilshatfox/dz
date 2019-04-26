import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book(1, "123", "4qwe", "2weer");
        Book b2 = new Book(2, "12sdf3", "qsfwe", "3weer");
        Book b3 = new Book(3, "12sdf3", "qsfswe", "7weer");
        Book b4 = new Book(4, "3123", "qgwe", "4weer");
        Book b5 = new Book(5, "5123", "2qwe", "9weer");

        Library lib = new Library();
        lib.add(b1);
        lib.add(b2);
        lib.add(b3);
        lib.add(b4);
        lib.add(b5);

        Comparator<Book> comp = (Book s1, Book s2) -> s2.page - s1.page;

        System.out.println(lib.top10(comp, 10).toString());
    }
}
