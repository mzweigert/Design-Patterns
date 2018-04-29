package observer.observable;

import observer.observer.Observer;

public interface Observable {
    void register(Observer obj);
    void unregister(Observer obj);
    void notifyObservers();
    Object getUpdated();
    int sizeOfObservers();
}
