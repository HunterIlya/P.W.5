package library.service;

import library.model.*;

public class ObjectFactory {

    public static User createUser(
            String name
    ) {

        System.out.println(
                "ObjectFactory.createUser()"
        );

        return new User(name);
    }

    public static Book createBook(
            String title,
            Author author
    ) {

        System.out.println(
                "ObjectFactory.createBook()"
        );

        return new Book(
                title,
                author
        );
    }

    public static ElectronicResource
    createElectronicResource(
            String title,
            String url
    ) {

        System.out.println(
                "ObjectFactory.createElectronicResource()"
        );

        return new ElectronicResource(
                title,
                url
        );
    }
}
