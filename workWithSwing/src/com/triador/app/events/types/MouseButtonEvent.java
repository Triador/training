package com.triador.app.events.types;

import com.triador.app.events.Event;

/**
 * Created by antonandreev on 13/04/2017.
 */
public class MouseButtonEvent extends Event {

    private int keyCode, x, y;

    protected MouseButtonEvent(Type type, int keyCode, int x, int y) {
        super(type);
        this.keyCode = keyCode;
        this.x = x;
        this.y = y;
    }

    public int getKeyCode() {
        return keyCode;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
