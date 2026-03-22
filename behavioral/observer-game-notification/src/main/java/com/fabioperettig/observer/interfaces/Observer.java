package com.fabioperettig.observer.interfaces;

/**
 * Interface that defines the update contract for all objects
 * that want to be notified by a Subject.
 */
public interface Observer {

    void update(String gameTitle);
}
