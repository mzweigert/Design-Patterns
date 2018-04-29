package observer.observer;

import observer.observable.Observable;
import observer.observable.Product;

import java.util.ArrayList;
import java.util.List;

public class MailSender implements Observer {

    private List<User> users = new ArrayList<>();
    private final Observable subject;

    public MailSender(List<User> users, Observable observable){
        this.users = users;
        this.subject = observable;
        this.subject.register(this);
    }

    @Override
    public void update() {
        Object updated = subject.getUpdated();
        if(updated instanceof List){
            sendMailToUsers(((List<Product>) updated));
        }
    }

    private void sendMailToUsers(List<Product> products) {
        System.out.println("Sending mail to users with info about products");
        users.forEach( u -> {
            StringBuilder builder = new StringBuilder();
            builder.append("Hi ").append(u.getName()).append("! This prices has changed is us shop! \n");
            products.forEach(p -> builder.append(p.getName())
                    .append(" =, new price: ")
                    .append(p.getPrice()).
                            append(" \n"));
            u.receiveMail(builder.toString());
        });
    }
}
