package library.model;

public class Book extends LibraryItem {

    private Author author;

    public Book(String title, Author author) {
        super(title);
        this.author = author;
    }

    @Override
    public void getItemInfo() {
        System.out.println("Book.getItemInfo(): " + title + ", author=" + author);
    }
}
