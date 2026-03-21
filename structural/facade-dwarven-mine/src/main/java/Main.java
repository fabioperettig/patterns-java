import com.fabioperettig.facade.*;

public class Main {

    public static void main(String[] args) {
        var facade = new DwarvenGoldMineFacade();
        facade.startNewDay();
        facade.digOutGold();
        facade.endDay();
    }

}
