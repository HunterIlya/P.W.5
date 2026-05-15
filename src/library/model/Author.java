package library.model;

public class Author {

    private String name;

    public Author(String name) {
        this.name = name;
    }

    public static void showAuthorInfo() {

        System.out.println(
                "Author.showAuthorInfo()"
        );
    }

    @Override
    public String toString() {
        return name;
    }
}
