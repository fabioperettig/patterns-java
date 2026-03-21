package com.fabioperettig.facade;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GoldDigger extends DwarvenMineWorker{


    @Override
    public void work() {
        log.info("{} collected another ore and has more golden dust in his nails.",name());
    }

    @Override
    public String name() {
        return "Dwarf Gold Digger";
    }
}
