package com.triador.singleton;

/**
 * pros
 * 1) lazy initialization
 * 2) high performance
 * cons
 * 1) supported only with JDK 1.5
 */
public class DoubleCheckedLocking {

    private static volatile DoubleCheckedLocking instance;

    public static DoubleCheckedLocking getInstance() {
        DoubleCheckedLocking localInstance = instance;
        if (localInstance == null) {
            synchronized (DoubleCheckedLocking.class) {
                localInstance = instance;
                if (localInstance == null) {
                    return new DoubleCheckedLocking();
                }
            }
        }
        return instance;
    }
}
