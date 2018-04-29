package observer.observer;

public class User {

    private String name;

    public User(String name){
        this.name = name;
    }

    public void receiveNotifyFromPhone(String message) {
        System.out.println(message);
    }

    public void receiveMail(String message) {
        System.out.println(message);
    }

    public String getName() {
        return name;
    }
}
