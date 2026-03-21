package com.fabioperettig.facade;

import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class DwarvenMineWorker {

    public abstract void work();
    public abstract String name();

    public void wakeUp(){
        log.info("{} wakes up.", name());
    }

    public void goToMine(){
        log.info("{} goes to the mine.\n", name());
    }

    //work();

    public void goHome(){
        log.info("{} goes home.", name());
    }

    public void goToSleep(){
        log.info("{} goes to sleep.\n", name());
    }

    private void action (Action action) {
        switch (action){
            case WAKE_UP -> wakeUp();
            case GO_TO_MINE -> goToMine();
            case WORK -> work();
            case GO_HOME -> goHome();
            case GO_TO_SLEEP -> goToSleep();
            default -> log.info("Undefined");
        }
    }

    enum Action {
        WAKE_UP,
        GO_TO_MINE,
        WORK,
        GO_HOME,
        GO_TO_SLEEP
    }

    /*Perform*/
    public void action(Action... action){
        Arrays.stream(action).forEach(this::action);
    }
}
