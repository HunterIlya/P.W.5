package library.service;

import library.model.Book;
import library.model.User;

public class BookIssue {

    public static void issueBook(
            User user,
            Book book
    ) {

        System.out.println(
                "BookIssue.issueBook()"
        );

        user.showInfo();
        book.getItemInfo();
    }
}
