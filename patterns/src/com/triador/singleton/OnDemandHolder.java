package com.triador.singleton;

/**
 * pros
 * 1) lazy initialization
 * 2) high performance
 * cons
 * 1) impossible to use for non static fields
 */
public class OnDemandHolder {

    public static class SingletonHolder {
        public static final OnDemandHolder HOLDER_INSTANCE = new OnDemandHolder();
    }

    public static OnDemandHolder getInstance() {
        return SingletonHolder.HOLDER_INSTANCE;
    }
}
