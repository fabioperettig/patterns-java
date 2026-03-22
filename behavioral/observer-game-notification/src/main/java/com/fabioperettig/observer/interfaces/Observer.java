package com.fabioperettig.observer.interfaces;

/**
 * Interface that defines the update contract
 * for all objects the want to be notified by s Subject;
 */
public interface Observer {

    void update(String gameTitle);

}
