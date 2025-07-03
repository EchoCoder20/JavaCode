public class Ring {
    int currentSize;
    boolean isOrignal;
    public void wear(int currentSize)
    {
        this.currentSize = currentSize;
        if(currentSize<10)
        {
            this.currentSize++;
        } else if (currentSize>=50) {
            this.currentSize--;
        }
        else{
            System.out.println("No need to change the size");
        }
    }
    public void remove(boolean isOrignal)
    {
        if(isOrignal)
        {
            System.out.println("You do not need to remove the ring");
        }
        else {
            System.out.println("You need to remove the ring");
        }
    }
}
