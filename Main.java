package library;

import library.model.*;
import library.service.*;

public class Main {

    public static void main(String[] args) {

        Person user = new User("Ivan");
        Person librarian = new Librarian("Anna");

        user.showInfo();
        librarian.showInfo();

        Author author = new Author("George Orwell");

        LibraryItem book = new Book("1984", author);
        LibraryItem resource = new ElectronicResource(
                "Java Guide",
                "https://example.com"
        );

        book.getItemInfo();
        resource.getItemInfo();

        BookIssue issue = new BookIssue();
        issue.issueBook((User) user, (Book) book);
    }
}
