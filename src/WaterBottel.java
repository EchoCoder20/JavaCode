public class WaterBottel {
    int size;
    String color="Red";
    int capacity;
    boolean isFilled;
    boolean isOpen;
    public void Filled(boolean filled) {
        isFilled = filled;
        if (isFilled) { System.out.println("The WaterBottel is Filled"); }
        else { System.out.println("The WaterBottel is not Filled"); }
    }
    public void bottelState(boolean isOpen)
    {
        this.isOpen = isOpen;
    }
}
