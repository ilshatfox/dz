import java.util.ArrayList;
import java.util.Comparator;

public class Library {
    ArrayList<Book> books = new ArrayList<>();
    public void add(Book book) {
        books.add(book);
    }

    public ArrayList<Book> top10(Comparator<Book> comp, int n) {
        if (n >= books.size()) {
            throw new IndexOutOfBoundsException("Вышел за границы");
        }
        books.sort(comp);
        ArrayList<Book> newList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            newList.add(books.get(i));
        }
        return newList;
    }
}
