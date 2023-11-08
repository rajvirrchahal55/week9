package question5;
/*Write a Java program to create a vehicle class hierarchy. The base class should be
Vehicle, with subclasses Truck, Car and Motorcycle. Each subclass should have
properties such as make, model, year, and fuel type. Implement methods for
calculating fuel efficiency, distance traveled, and maximum speed.*/
public class Vehicle {
    String make;
    String model;
    int year;
    String fueltype;

    public Vehicle(String make,String model,int year,String fueltype){
        this.make = make;
        this.model = model;
        this.year = year;
        this.fueltype = fueltype;
    }

    public String getmake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getFueltype() {
        return fueltype;
    }
}








