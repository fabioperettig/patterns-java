package com.fabioperettig.observer.concretes;
import com.fabioperettig.observer.interfaces.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Concrete implementation of Subject.
 * This class keeps track of all registered players and notifies them.
 */
public class GameStore implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String latestGame;

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        // Loops through all followers to deliver the news
        for (Observer observer : observers) {
            observer.update(latestGame);
        }
    }

    /**
     * Business logic to release one or multiple games at once.
     * It uses Java Streams to iterate through titles and trigger
     * the notification process for each one.
     */
    public void releaseGame(String... gameTitles) {
        java.util.Arrays.stream(gameTitles).forEach(gameTitle ->{
            this.latestGame = gameTitle;
            System.out.printf("\n[Store] New game available: %s\n", gameTitle);
            notifyObservers();
            System.out.println("\n------------------------------------------------------------");
        });
    }
}

