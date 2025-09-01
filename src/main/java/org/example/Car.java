package org.example;

public class Car {
    int wheels;
    String color;
    public Car(int wheelsT, String colorT){
        this.wheels = wheelsT;
        this.color = colorT;
    }
    @Override
    public String toString() {
        return "Car{" +
                "wheels=" + wheels +
                ", color='" + color + '\'' +
                '}';
    }
}
