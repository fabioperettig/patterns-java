package com.fabioperettig.observer.interfaces;

/**
 * Interface that defines the management of Observers.
 * Any class that wants to be "observed" must implement this.
 */
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
