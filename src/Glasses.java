public class Glasses {
    String lensType;
    String style;
    boolean isWorn;
    boolean isClean;
    int durationofUse;
    public void changingLens(int duration )
    {
        this.durationofUse = duration;
        if(durationofUse == 0)
        {
            System.out.println("No need to change the lens");
        }
        else
        {
            System.out.println("Changing lens requires");

        }
    }
    public void protaction(boolean isWorn)
    {

        if(isWorn)
        {
            System.out.println("Your eyes protected");
        }
        else
        {
            System.out.println("Your eyes restricted");
        }


    }

}
