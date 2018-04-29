package observer.observer;

import observer.observable.Observable;
import observer.observable.Product;

import java.util.List;

public class PhoneNotificator implements Observer {
    private final User user;
    private final Observable subject;

    public PhoneNotificator(User user, Observable observable){
        this.user = user;
        this.subject = observable;
        this.subject.register(this);
    }

    @Override
    public void update() {
        Object updated = subject.getUpdated();
        if(updated instanceof List){
            notifyUsers(((List<Product>) updated));
        }
    }

    private void notifyUsers(List<Product> products) {
        StringBuilder message = new StringBuilder();
        message.append("Hi from phone! This products price has changed. \n");
        for (Product product : products) {
            message.append(product.getName()).append(" =, new price: ").append(product.getPrice()).append(" \n");
        }
        user.receiveNotifyFromPhone(message.toString());
    }
}
