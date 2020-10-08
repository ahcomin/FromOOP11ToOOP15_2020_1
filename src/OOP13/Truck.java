package OOP13;

import OOP11.Person;

import java.util.stream.StreamSupport;

public class Truck extends Vehicle {//class Truck derived from the class vehicle
    private double load;// Capacity in tons
    private int tow;    // Capacity in pounds

    // Constructors.
    // Includes all variations in Vehicle class,
    // plus one to specify all values, including
    // load and towing capacities.

    public Truck() {
        super();
        load = 0;
        tow = 0;
    }

    public Truck(String aBrand) {
        super(aBrand);
        load = 0;
        tow = 0;
    }

    public Truck(String aBrand, int banger) {
        super(aBrand, banger);
        load = 0;
        tow = 0;
    }

    public Truck(Person theOwner) {
        super(theOwner);
        load = 0;
        tow = 0;
    }

    public Truck(Person theOwner, int banger) {
        super(theOwner, banger);
        load = 0;
        tow = 0;
    }

    public Truck(Person theOwner, String brand) {
        super(theOwner, brand);
        load = 0;
        tow = 0;
    }

    public Truck(Person theOwner, String brand, int banger) {
        super(theOwner, brand, banger);
        load = 0;
        tow = 0;
    }

    //parameterized constructor
    public Truck(Person theOwner, String brand, int banger,
                 double aLoad, int aTow) {
        super(theOwner, brand, banger);
        load = aLoad;
        tow = aTow;
    }

    // Methods to write values:

    // Write all values

    public void writeOutput() {
        super.writeOutput();
        System.out.println("Load capacity: " + load + " tons.");
        System.out.println("Towing capacity: " + tow + " pounds.");
    }

    public void writeLoad() {
        System.out.println("Load capacity: " + load + " tons");
    }

    public void writeTow() {
        System.out.println("Towing capacity: " + tow + " pounds");
    }

    // Methods to change values of parameters.

    public void set(Person newOwner, String newBrand,
                    int newCylinders, double newLoad, int newTow) {
        super.set(newOwner, newBrand, newCylinders);
        load = newLoad;
        tow = newTow;
    }

    public void setLoad(double newLoad) {
        load = newLoad;
    }

    public void setTow(int newTow) {
        tow = newTow;
    }

    // Methods to return parameter values.

    public double getLoad() {
        return load;
    }

    public int getTow() {
        return tow;
    }

    // equals method

    public boolean equals(Truck otherTruck) {
        return (super.equals(otherTruck)
                && this.load == otherTruck.getLoad()
                && this.tow == otherTruck.getTow());
    }

    public static void main(String[] args) {//main method is defined here.
        System.out.println("Truck 1");
        Person ownerMinyoung = new Person("kim min young");
        Truck t = new Truck(ownerMinyoung, "t",1,30,50);
        t.writeOutput();

    }
}
