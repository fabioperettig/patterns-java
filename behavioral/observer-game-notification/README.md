# Game Notification System (Observer Pattern) #



A practical implementation of the Observer Design Pattern using Java 17 and Maven. This project simulates a game store notification system where players are notified whenever new games are released.

## 🎯 Purpose
The goal of this project is to demonstrate Loose Coupling between objects. The GameStore (Subject) doesn't need to know the internal logic of the Player (Observer); it only needs to know that the player implements the Observer interface.

## 🛠️ Tech Stack
- Java 17
- Maven (Multi-module structure)
- Java Streams & Varargs (For modern and clean code)

## 🏗️ Project Structure
- Subject: Interface that defines how to manage subscriptions.
- Observer: Interface that defines the update contract.
- Player: The concrete observer that reacts to new game releases.
- GameStore: The concrete subject that holds the state and notifies subscribers.

````
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

    public void releaseGame(String... gameTitles) {
        java.util.Arrays.stream(gameTitles).forEach(gameTitle ->{
            this.latestGame = gameTitle;
            System.out.printf("\n[Store] New game available: %s\n", gameTitle);
            notifyObservers();
            System.out.println("\n--------------------");
        });
    }
}
````
````
public class Main {
    public static void main(String[] args) {

        GameStore misterGames = new GameStore();

        Player p1 = new Player("Marshmallow");
        Player p2 = new Player("Vivika");

        misterGames.registerObserver(p1);
        misterGames.registerObserver(p2);

        // List of games released and calling the releases through a Stream method
        var releases = java.util.List.of("Skyrim", "Half Life");
        releases.forEach(misterGames::releaseGame);
    }
}
````

## 🚀 Key Features
- Massive Releases: Support for releasing multiple games at once using Java Varargs and Streams.
- Dynamic Subscription: Players can subscribe or unsubscribe from notifications at any time.
- Decoupled Logic: High maintainability by separating the store logic from the notification delivery.