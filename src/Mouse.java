public class Mouse {
    boolean isWired;
    boolean isOld;
    String type;
    public void timeResponse(boolean isOld, boolean isWired)
    {
        if(!isWired && isOld)
        {
            System.out.println("The time response of mouse is less");
        }
        else
        {
            System.out.println("The time response of mouse is normal");
        }
    }
    public void usesofMouse(String type)
    {
        if(type.equals("Gamming"))
        {
            System.out.println("You can click, move and scroll");
        }
        else {
            System.out.println("You can click and move");
        }
    }
}
