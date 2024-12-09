package PraktikumPBO.Sesi10.Vehicle;

//superclass

class Vehicle {
    String brand;

    //consructor
    public Vehicle(String brand) {
        this.brand = brand;
    }

    //Method
    public void displayinfo() {
        System.out.println("Brand : " + brand);
    }
}

//subclass
class Car extends Vehicle {

    int doors;
    //constructor
    public Car(String brand, int doors) {
        super(brand);
        this.doors = doors;
    }

    //override method displayinfo
    public void displayinfo(String type) {
        super.displayinfo();
        System.out.println("Type  : " + type);
        System.out.println("Doors : " + doors);
    }
}

public class VehicleTester {
    public static void main(String[] args) {
        //create object from subclass Car
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Car car = new Car("Toyota", 4);
        car.displayinfo("Sedan");
    }
}