public class VR {
    int currentCharge=100;
    String currentScope;
    boolean isOn;
    public void watching(boolean isOn, String currentScope)
    {
        if(isOn)
        {
            currentCharge--;
            this.currentScope=currentScope;
        }
        else
        {
            this.isOn=false;
        }
    }
    public void changeVideos()
    {
        if(isOn)
        {
            System.out.println("You can Change video");
        }
        else
        {
            System.out.println("You can't Change video");
        }
    }

}
