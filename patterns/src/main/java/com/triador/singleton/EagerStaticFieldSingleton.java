package com.triador.singleton;

/**
 * pros
 * 1) simple and clear implementation
 * 2) thread safety
 * cons
 * 1) not lazy initialization
 */
public class EagerStaticFieldSingleton {
    public static final EagerStaticFieldSingleton singleton = new EagerStaticFieldSingleton();
}
