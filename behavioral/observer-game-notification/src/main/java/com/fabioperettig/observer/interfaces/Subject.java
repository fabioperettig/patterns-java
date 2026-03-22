package com.fabioperettig.observer.interfaces;

/**
 * Interface that defines the management of Observers.
 * Any class that wants to be "observed" must implement it.
 */
public interface Subject {

    void registerObserver(Observer observerList);
    void removeObserver(Observer observerList);
    void notifyObservers();

}
