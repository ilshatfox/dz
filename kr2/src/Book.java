public class Book {
    int page;
    String bookName;
    String authorName;
    String mainCharacter;

    public Book(int page, String bookName, String authorName, String mainCharacter) {
        this.page = page;
        this.bookName = bookName;
        this.authorName = authorName;
        this.mainCharacter = mainCharacter;
    }

    @Override
    public String toString() {
        return "Book{page=" + page +
                " bookName=" + bookName + "}";
    }

}
