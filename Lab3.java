class Vehicle {
    String brand;
    Vehicle(String brand) {
        this.brand = brand;
    }
    void display() {
        System.out.println("Vehicle Brand: " + brand);
    }
}

class Car extends Vehicle {
    String model;
    Car(String brand, String model) {
        super(brand);
        this.model = model;
    }
    void display() {
        super.display();
        System.out.println("Car Model: " + model);
    }
}

class ElectricCar extends Car {
    int batteryCapacity;
    ElectricCar(String brand, String model, int batteryCapacity) {
        super(brand, model);
        this.batteryCapacity = batteryCapacity;
    }
    void display() {
        super.display();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}

public class Lab3 {
    public static void main(String[] args) {
        ElectricCar e = new ElectricCar("Tesla", "Model S", 100);
        e.display();
    }
}
