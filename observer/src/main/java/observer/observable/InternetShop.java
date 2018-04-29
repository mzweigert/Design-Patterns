package observer.observable;

import observer.observer.Observer;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class InternetShop implements Observable {
    private List<Product> products = Product.createShopProducts();
    private Set<Observer> observers = new HashSet<>();

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(Observer::update);
    }

    @Override
    public Object getUpdated() {
        return products;
    }

    @Override
    public int sizeOfObservers() {
        return observers.size();
    }

    public void lowerThePrice(){
        products.forEach(p -> p.setPrice(p.getPrice().multiply(BigDecimal.valueOf(0.8))));
        notifyObservers();
    }
}
