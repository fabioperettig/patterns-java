package com.fabioperettig.facade;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TunnelDigger extends DwarvenMineWorker{


    @Override
    public void work() {
        log.info("{} dives through the earth and makes another tunnel.", name());
    }

    @Override
    public String name() {
        return "Dwarf Tunnel Digger";
    }
}
