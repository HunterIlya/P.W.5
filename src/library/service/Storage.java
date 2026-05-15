package library.service;

import library.model.*;

import java.util.ArrayList;
import java.util.List;

public class Storage {

    public static List<User> users =
            new ArrayList<>();

    public static List<LibraryItem> items =
            new ArrayList<>();

    public static void showStorageState() {

        System.out.println(
                "Storage.showStorageState()"
        );

        System.out.println(
                "Users count: "
                        + users.size()
        );

        System.out.println(
                "Items count: "
                        + items.size()
        );
    }
}
