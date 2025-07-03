public class Charge {
    boolean usedWire;
    String type;
    boolean functionalState;
    public void charging(boolean isWired, String type,boolean functionalState)
    {
        this.usedWire = isWired;
        this.type = type;
        this.functionalState = functionalState;
        if(usedWire && functionalState)
        {
            System.out.println("You can use charge safely");
        }
        else
        {
            System.out.println("You cannot use charge safely");
        }
    }
}
