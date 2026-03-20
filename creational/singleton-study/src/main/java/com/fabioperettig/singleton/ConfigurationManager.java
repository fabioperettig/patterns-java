package com.fabioperettig.singleton;

public class ConfigurationManager {

    private static volatile ConfigurationManager instance;
    private String appName;

    private ConfigurationManager(){
        this.appName = "Manager app title";
    }

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            synchronized (ConfigurationManager.class) {
                if (instance == null) {
                    instance = new ConfigurationManager();
                }
            }
        }
        return instance;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }
}
