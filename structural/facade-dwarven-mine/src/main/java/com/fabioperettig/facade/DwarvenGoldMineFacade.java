package com.fabioperettig.facade;

import java.util.Collection;
import java.util.List;

public class DwarvenGoldMineFacade {

    private final List<DwarvenMineWorker> workers;

    //ctor
    public DwarvenGoldMineFacade() {
        workers = List.of(new TunnelDigger(), new GoldDigger(), new CartOperator());
    }

    public void startNewDay() {
        makeActions(workers, DwarvenMineWorker.Action.WAKE_UP, DwarvenMineWorker.Action.GO_TO_MINE);
    }

    public void digOutGold() {
        makeActions(workers, DwarvenMineWorker.Action.WORK);
    }

    public void endDay() {
        makeActions(workers, DwarvenMineWorker.Action.GO_HOME, DwarvenMineWorker.Action.GO_TO_SLEEP);
    }

   private static void makeActions(Collection<DwarvenMineWorker> workers, DwarvenMineWorker.Action... actions) {
        workers.forEach(worker -> worker.action(actions));
   }

}
