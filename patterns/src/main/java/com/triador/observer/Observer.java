package com.triador.observer;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
