package com.triador.singleton;

/**
 * pros
 * 1) lazy initialization
 * cons
 * 2) low performance
 */
public class SynchronizedAccessor {

    private static SynchronizedAccessor instance;

    public static synchronized SynchronizedAccessor getInstance() {
        if (instance == null) {
            return new SynchronizedAccessor();
        }
        return instance;
    }
}
