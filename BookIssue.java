package library.model;

public class User extends Person {

    private boolean active;

    public User(String name) {
        super(name);
        this.active = false;
    }

    public void activateAccount() {
        active = true;
    }

    @Override
    public void showInfo() {
        System.out.println("User.showInfo(): " + name + ", active=" + active);
    }
}
