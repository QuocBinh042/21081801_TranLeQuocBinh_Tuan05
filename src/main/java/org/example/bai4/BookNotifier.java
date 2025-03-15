package org.example.bai4;

import java.util.ArrayList;
import java.util.List;

public class BookNotifier implements Subject{
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer o : observers) {
            o.update(message);
        }
    }

    public void newBookAdded(String title){
        String message = "New book added: " + title;
        notifyObservers(message);
    }

    public void bookExpired(String title){
        String message = "Book expired: " + title;
        notifyObservers(message);
    }
}
