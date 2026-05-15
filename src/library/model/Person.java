package library.model;

public abstract class Person {

    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public static void showPersonType() {
        System.out.println("Person.showPersonType()");
    }

    public abstract void showInfo();
}
