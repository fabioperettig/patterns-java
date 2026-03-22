package com.fabioperettig.observer.concretes;
import com.fabioperettig.observer.interfaces.Observer;
import com.fabioperettig.observer.interfaces.Subject;

import java.util.List;
import java.util.ArrayList;

/**
 * Concrete implementation of Interface 'Subject'. This class
 * keeps track of all registered observers and notifies them.
 */
public class GameStore implements Subject {

    private List<Observer> observers = new ArrayList<>();
    private String release;

    @Override
    public void registerObserver(Observer observerList) {
        observers.add(observerList);
    }

    @Override
    public void removeObserver(Observer observerList) {
        observers.remove(observerList);
    }

    @Override
    public void notifyObservers() {

        // Loops through all observers to notify about the release.
        for (Observer observer : observers){
            observer.update(release);
        }

    }
}
