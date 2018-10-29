package com.triador.MVC.controller;

import com.triador.MVC.model.Car;
import com.triador.MVC.view.CarView;

public class CarController {

    private Car model;
    private CarView view;

    public CarController(Car model, CarView view) {
        this.model = model;
        this.view = view;
    }

    public void setName(String name) {
        model.setName(name);
    }

    public String getName() {
        return model.getName();
    }

    public void setManufacturer(String manufacturer) {
        model.setManufacturer(manufacturer);
    }

    public String getManufacturer() {
        return model.getManufacturer();
    }

    public void updateView() {
        view.printCarDetails(model.getName(), model.getManufacturer());
    }
}
