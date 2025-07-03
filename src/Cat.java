public class Cat {
    String name;
    String typeofFood;
    boolean isSick;
    public void playingMode(boolean isSick)
    {
        this.isSick=isSick;
        if(isSick)
        {
            System.out.println("Cat is sick !! Can not play");
        }
        else
        {
            System.out.println("Cat is playing ");
        }
    }
    public void eating(String typeofFood)
    {
        if(typeofFood.equals("Banana"))
        {
            System.out.println("Cat will not eat");
        }
        else
        {
            System.out.println("Cat is eating");
        }
    }

}
