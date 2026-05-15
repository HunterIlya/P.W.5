package library;

import library.model.*;
import library.service.*;

public class Main {

    public static void main(
            String[] args
    ) {

        Person.showPersonType();

        LibraryItem.showItemCategory();

        Author.showAuthorInfo();

        User user =
                ObjectFactory.createUser(
                        "Ivan"
                );

        user.activateAccount();

        Author author =
                new Author(
                        "George Orwell"
                );

        Book book =
                ObjectFactory.createBook(
                        "1984",
                        author
                );

        ElectronicResource resource =
                ObjectFactory
                        .createElectronicResource(
                                "Java Guide",
                                "https://example.com"
                        );

        Storage.users.add(user);

        Storage.items.add(book);

        Storage.items.add(resource);

        for (
                LibraryItem item
                : Storage.items
        ) {

            item.getItemInfo();
        }

        BookIssue.issueBook(
                user,
                book
        );

        Storage.showStorageState();
    }
}
