package library.model;

public abstract class LibraryItem {

    protected String title;

    public LibraryItem(String title) {
        this.title = title;
    }

    public static void showItemCategory() {

        System.out.println(
                "LibraryItem.showItemCategory()"
        );
    }

    public abstract void getItemInfo();
}
