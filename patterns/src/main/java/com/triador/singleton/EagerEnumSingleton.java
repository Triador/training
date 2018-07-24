package com.triador.singleton;

/**
 * pros
 * 1) cleverly
 * 2) serialization out of the box
 * 3) thread safety out of the box
 * 4) ability to use EnumSet, EnumMap etc.
 * 5) switch support
 * cons
 * 1) not lazy initialization
 */
public enum EagerEnumSingleton {
    INSTANCE;
}
