package library.model;

public abstract class LibraryItem {

    protected String title;

    public LibraryItem(String title) {
        this.title = title;
    }

    public void getItemInfo() {
        System.out.println("LibraryItem.getItemInfo()");
    }
}
