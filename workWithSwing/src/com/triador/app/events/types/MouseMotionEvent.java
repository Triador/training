package com.triador.app.events.types;

import com.triador.app.events.Event;

/**
 * Created by antonandreev on 13/04/2017.
 */
public class MouseMotionEvent extends Event {

    private int x, y;

    public MouseMotionEvent(int x, int y) {
        super(Type.MOUSE_MOVED);
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
