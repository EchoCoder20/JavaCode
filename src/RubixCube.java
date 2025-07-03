public class RubixCube {
    String type;
    boolean isSolved;

    public void disintegrate(String type , boolean isDisintegrate)
    {
        if(isDisintegrate)
        {
            this.type = type;
            if(type.equals("5*5"))
            {
                System.out.println("You need more time to integrate the cube");
            }
            else
            {
                System.out.println("You can do it fast");
            }
        }
    }
    public void rotate(boolean isSolved)
    {
        if(isSolved)
        {
            System.out.println("Stop rotation");

        }
        else
        {
            System.out.println("Complete solve the cube");
        }
    }
}
