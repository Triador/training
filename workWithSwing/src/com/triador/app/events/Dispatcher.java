package com.triador.app.events;

/**
 * Created by antonandreev on 13/04/2017.
 */
public class Dispatcher {

    private Event event;

    public Dispatcher(Event event) {
        this.event = event;
    }

    public void dispatch(Event.Type type, EventHandler handler) {

        if (event.handled) {
            return;
        }

        if (event.getType() == type) {
            event.handled =  handler.handle(event);
        }
    }
}




