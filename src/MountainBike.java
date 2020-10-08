import java.lang.management.MonitorInfo;

public class MountainBike extends Bike{
    public int seatHeight;
    //the mountainBike subclass adds one field.
    public MountainBike (int startHeight, int startCadence, int startSpeed, int startGear){
        super(startCadence, startSpeed, startGear); //introduce later
        seatHeight = startHeight;
    }

    //the MountainBike subclass adds one method.
    public void setHeight(int newValue){
        seatHeight = newValue;

    }
    public void applyBrake(int decrement){//base class 에있는 메서드와 같은 이름.
        speed = 0;
        //이 자전거는 브레이크가 잘댐 ㅇㅇ.
    }
}
