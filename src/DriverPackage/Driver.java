package DriverPackage;

public class Driver implements DriverRules{
    Integer driverAge;
    Boolean hasLiense;
    String driverName;
    String phoneNumber;
    String civilID;
    static String test;


    public void changeAgeDriver() {
        System.out.println("DriverPackage.Driver Age is "+driverAge);
    }
    public void wearSeatBelt()
    {
        System.out.println("DriverPackage.Driver Seat Belt is "+driverName);
    }
    public void followSpeedLimit()
    {
        System.out.println("DriverPackage.Driver Speed Limit is "+driverName);
    }

}
