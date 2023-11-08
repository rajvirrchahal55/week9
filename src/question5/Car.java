package question5;
/*5. Write a Java program to create a vehicle class hierarchy. The base class should be
Vehicle, with subclasses Truck, Car and Motorcycle. Each subclass should have
properties such as make, model, year, and fuel type. Implement methods for
calculating fuel efficiency, distance traveled, and maximum speed.*/
public class Car extends Vehicle {
    private static double getfuelefficiency;

    double fuelefficiency;
    double distancetraveled;
    double maxiumspeed;
    public static void main(String[]args){
        Car obj=new Car("Toyota","Camry",2022,"regular",25.5,500,100);
        getfuelefficiency = obj.getfuelefficiency();
        System.out.println("fuel efficiency: "+getfuelefficiency+" miles per gallon");
        System.out.println("distance traveled: "+obj.getfuelefficiency()+" miles");
        System.out.println("maxium speed: "+obj.getmaxiumspeed()+" miles per hour" );
    }
    public Car (String make,String model,int year,String fueltype,double fuelefficiency,double distancetraveled,double maxiumspeed){
        super(make,model,year,fueltype);
        this.fuelefficiency=fuelefficiency;
        this.distancetraveled=distancetraveled;
        this.maxiumspeed=maxiumspeed;
    }

    public double getfuelefficiency() {
        fuelefficiency = distancetraveled/fuelefficiency;
        return fuelefficiency;

    }
    public double getdistancetraveled(){
        return distancetraveled;
    }
    public double getmaxiumspeed(){
        return maxiumspeed;
    }
}

