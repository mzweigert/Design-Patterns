package observer.observer;

import observer.observable.Product;
import observer.observable.Observable;

import java.util.List;

public class Billboard implements Observer {

    private final Observable subject;

    public Billboard(Observable observable){
        this.subject = observable;
        this.subject.register(this);
    }

    @Override
    public void update() {
        Object updated = subject.getUpdated();
        if(updated instanceof List){
            System.out.println("New prices in shop ! \n ");
            ((List<Product>) updated).forEach(this::showOnScreen);
        }
    }

    private void showOnScreen(Product product){
        System.out.println("Product :" + product.getName()  + " has now price:" + product.getPrice());
    }
}
