import java.util.Scanner;

public class Bike {
    public int cadence, gear, speed;

    public Bike() {
        System.out.println("NO bike");
    }

    public Bike(int startCadence, int startSpeed, int startGear) {//생성자 3개 파라메타
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;

    }

    public void setCedence(int newValue) {
        cadence = newValue;

    }

    public void setGear(int newvalue) {
        gear = newvalue;

    }

    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }
}
