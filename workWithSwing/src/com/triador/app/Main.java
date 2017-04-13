package com.triador.app;

import com.triador.app.core.Window;
import com.triador.app.sandbox.Example;

import java.awt.*;

/**
 * Created by antonandreev on 12/04/2017.
 */
public class Main {
    public static void main(String[] args) {
        Window window = new Window("Window", 960, 640);
        window.addLayer(new Example("Layer-1", Color.BLUE));
        window.addLayer(new Example("Layer-2", Color.RED));
    }

}
