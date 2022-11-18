package com.macro.mall.tiny.designPattern.单例;

public final class BaseSingleton {
    private static BaseSingleton instance;
    public String value;

    private BaseSingleton(String value) {
        // The following code emulates slow initialization.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static BaseSingleton getInstance(String value) {
        if (instance == null) {
            instance = new BaseSingleton(value);
        }
        return instance;
    }
}