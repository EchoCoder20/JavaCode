public class Car {
    String engineType;
    String name;
    int currentSpeed;
    boolean breakPressed;
    boolean isOpen;
    boolean isSmartDoors;
    public void changeSpeed(int speed)
    {
        currentSpeed = speed;
        if(currentSpeed>120)
        {
            breakPressed = true;
            System.out.println("Speed is greater than 120");
        }
        else
        {
            breakPressed = false;
            System.out.println("Speed is less than 120");
        }

    }
    public void moveForward( boolean isOpen , boolean isSmartDoors)
    {
        this.isOpen = isOpen;
        if(isOpen)
        {
            if(isSmartDoors)
            {
                System.out.println("Can move forward");
            }
            else
                 System.out.println("Can not move forward");
        }
        else System.out.println("Can move forward");

    }

}
