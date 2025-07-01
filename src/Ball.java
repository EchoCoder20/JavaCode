public class Ball {
    int currentSize;
    String color;
    String type;

    public void Rolling(boolean isRolling)
    {
        if(isRolling)
        {
            System.out.println("The ball is Rolling");
        }
        else
        {
            System.out.println("The ball is Not Rolling");
        }
    }
    public void ballDeflateInflate(int ballSize)
    {
        this.currentSize = ballSize;
        if(currentSize<=10)
        {
            System.out.println("The ball is in deflate");
        }
        else if(currentSize<=20)
        {
            System.out.println("The ball is in normal");
        }
        else
        {
            System.out.println("The ball is in inflate");
        }
    }
}
