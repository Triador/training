package com.triador.observer.weather;

public interface Subject {
    void registerObserver(MyObserver o);
    void removeObserver(MyObserver o);
    void notifyObservers();
}
