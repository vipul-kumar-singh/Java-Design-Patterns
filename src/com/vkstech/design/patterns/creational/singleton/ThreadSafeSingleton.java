package com.vkstech.design.patterns.creational.singleton;

import java.util.Objects;

public class ThreadSafeSingleton {

    private static ThreadSafeSingleton obj;

    private ThreadSafeSingleton() {
    }

    public static synchronized ThreadSafeSingleton getObj() {
        if (Objects.isNull(obj))
            obj = new ThreadSafeSingleton();
        return obj;
    }

    //double locking method
    public static ThreadSafeSingleton getInstanceUsingDoubleLocking() {
        if (Objects.isNull(obj)) {
            synchronized (ThreadSafeSingleton.class) {
                if (Objects.isNull(obj))
                    obj = new ThreadSafeSingleton();
            }
        }
        return obj;
    }
}
