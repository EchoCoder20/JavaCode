public class Cap {
    boolean isWorn;
    boolean isNew;
    boolean isClean;
    public  void wear(boolean isWorn)
    {   this.isWorn = isWorn;
        if(isWorn)
        {
            isNew = false;
            isClean=false;
        }
        else
        {
            isNew = true;
        }
    }
    public void wash()
    {
        if(isClean)
        {
            System.out.println("Clean cap");
        }
        else
        {
            System.out.println("Wash cap");
        }
    }
}
