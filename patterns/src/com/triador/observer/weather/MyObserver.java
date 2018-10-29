package com.triador.observer.weather;

public interface MyObserver {
    void update(float temp, float humidity, float pressure);
}
