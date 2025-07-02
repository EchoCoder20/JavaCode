public class Keyboard {

    boolean isWired;
    String langaugeSetting;
    boolean capslock;
    public void pressingKeys(boolean capsLock)
    {
        this.capslock = capsLock;
        if(capslock)
        {
            System.out.println("Capslock pressed");
        }
        else
        {
            System.out.println("Capslock not pressed");
        }
    }
    public void typing( String langaugeSetting)
    {
        if(langaugeSetting.equals("Arabic"))
        {
            this.langaugeSetting = "Arabic";
        }
        else
        {
            this.langaugeSetting = "English";
        }
    }
    public void responseTime(boolean isWired, int responseTime)
    {
        this.isWired = isWired;
       if(responseTime <10 && isWired)
       {
           System.out.println("Response time is less than 10, please check your hardware");
       }
       else if (responseTime<10 && !isWired) {
           System.out.println("Response time is less than 10, please check your connection");
       }
       else
           {
               System.out.println("All things is goood");

           }
    }
}
