package library.model;

public class Librarian extends Person {

    public Librarian(String name) {
        super(name);
    }

    @Override
    public void showInfo() {

        System.out.println(
                "Librarian.showInfo(): "
                        + name
        );
    }
}
