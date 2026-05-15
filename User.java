package library.model;

public abstract class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public void showInfo() {
        System.out.println("Person.showInfo()");
    }
}
