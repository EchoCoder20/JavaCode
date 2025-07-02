public class Pen {
    int currentInkLevel;
    boolean isCapped;
    boolean isUsed;
    boolean isDry;
    int length;
    public void InkLevel(int level)
    {
        currentInkLevel = level;
        if(currentInkLevel == 0)
            isDry = false;
        else isDry=true;
    }
    public void setLength(int length)
    {
        this.length = length;
    }
    public void usedState(boolean state)
    {
        isUsed = state;
        if(isUsed)
        {
            isCapped = false;
            System.out.println("The Pen is Used");
        }
        else
        {
            isCapped = true;
            System.out.println("The Pen is not Used");
        }
    }


}
