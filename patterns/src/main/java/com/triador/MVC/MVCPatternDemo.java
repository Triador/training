package com.triador.MVC;

import com.triador.MVC.controller.CarController;
import com.triador.MVC.model.Car;
import com.triador.MVC.view.CarView;

public class MVCPatternDemo {
    public static void main(String[] args) {
        Car model = retrieveCarFromDatabase();
        CarView view = new CarView();
        CarController controller = new CarController(model, view);
        controller.updateView();
        controller.setName("S6");
        controller.updateView();
    }

    private static Car retrieveCarFromDatabase() {
        Car car = new Car();
        car.setManufacturer("BMW");
        car.setName("S3");
        return car;
    }
}
