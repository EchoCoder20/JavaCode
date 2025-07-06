package DriverPackage;

public class TruckDriver extends Driver implements DriverRules{
    String test="Hello World";
//    test="hello bbbbb";
    public void changeAgeDriver() {
        System.out.println("Truck Driver Age is "+driverAge);
//        String a=Driver.test;


    }
    public void wearSeatBelt()
    {

        test="hi";
        System.out.println("Truck Driver Seat Belt is "+test);
    }
    public void followSpeedLimit()
    {
        System.out.println("Truck Driver Speed Limit is "+driverName);
    }

}
