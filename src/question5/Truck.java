package question5;
/*5. Write a Java program to create a vehicle class hierarchy. The base class should be
Vehicle, with subclasses Truck, Car and Motorcycle. Each subclass should have
properties such as make, model, year, and fuel type. Implement methods for
calculating fuel efficiency, distance traveled, and maximum speed.*/
public class Truck extends Vehicle{
    private static double getfuelefficiency;
    double fuelefficiency;
   double distancetraveled;
   double maxiumspeed;
    public static void main(String[]args){
      Truck obj2=new Truck("ford","f150",2022,"regular",15.5,1200,120);
        getfuelefficiency = obj2.getfuelefficiency();
        System.out.println("2 fuel efficiency: "+ getfuelefficiency +" miles per gallon");
        System.out.println("distance traveled: "+ obj2.distancetraveled +" miles");
        System.out.println("maxium speed: "+obj2.maxiumspeed + " miles per hour" );}

    public Truck (String make,String model,int year,String fueltype,double fuelefficiency,double distancetraveled,double maxiumspeed){
        super(make,model,year,fueltype);
       this.fuelefficiency=fuelefficiency;
       this.distancetraveled=distancetraveled;
       this.maxiumspeed=maxiumspeed;
    }

    public double getfuelefficiency() {
        fuelefficiency = distancetraveled/fuelefficiency;
        return fuelefficiency;
    }
    public double getdistancetraveled(double distancetraveled){
        return distancetraveled;
    }
    public double getmaxiumspeed(){
        return maxiumspeed;
    }
}
