package com.fabioperettig.facade;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CartOperator extends DwarvenMineWorker{
    @Override
    public void work() {
        log.info("{} moves gold chunks out of the mine.\n", name());
    }

    @Override
    public String name() {
        return "Dwarf Cart Operator";
    }
}
