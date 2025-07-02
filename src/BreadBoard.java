public class BreadBoard {
    boolean isUsed;
    String type;
    public void wireConnection(boolean isUsed)
    {
        if (isUsed)
        {
            System.out.println("The breadboard already used");
        }
        else
        {
            System.out.println("The breadboard is new");
        }
    }
    public void prototyping(String type)
    {
        if(type.equals("Small"))
        {
            System.out.println("The breadboard used for small project");
        } else if (type.equals("Medium")) {
            System.out.println("The breadboard used for medium project");
        }
        else{
            System.out.println("The breadboard used for large project");
        }
    }
}
