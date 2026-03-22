import com.fabioperettig.observer.concretes.*;

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
