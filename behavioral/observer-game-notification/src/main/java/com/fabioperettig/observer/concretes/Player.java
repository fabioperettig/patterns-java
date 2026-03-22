package com.fabioperettig.observer.concretes;
import com.fabioperettig.observer.interfaces.*;

/**
 * Concrete implementation of Observer.
 * Represents a user who receives notifications about new games.
 */
public class Player implements Observer {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    @Override
    public void update(String gameTitle) {
        System.out.printf("\nHello %s! Check out our fresh release: %s",name, gameTitle);
    }
}
