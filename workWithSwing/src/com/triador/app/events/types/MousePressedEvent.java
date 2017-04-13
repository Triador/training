package com.triador.app.events.types;

import com.triador.app.events.Event;

/**
 * Created by antonandreev on 13/04/2017.
 */
public class MousePressedEvent extends MouseButtonEvent {

    public MousePressedEvent(int keyCode, int x, int y) {
        super(Type.MOUSE_PRESSED, keyCode, x, y);
    }
}
