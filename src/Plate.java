public class Plate {
    String meterialType;
    boolean heatTolerant;
    boolean isEmpty;
    String size;

    public  void holdingFood(boolean isEmpty, String size )
    {
        this.isEmpty = isEmpty;
        if(isEmpty && size.equals("Small"))
        {
            System.out.println("You can hold food on plate, but!! not that much");
        }
        else if(isEmpty && size.equals("Medium"))
        {
            System.out.println("You can hold food on plate, but take care of the size");
        }
        else if(isEmpty && size.equals("Large"))
        {
            System.out.println("You can hold food on plate, you can add more food");
        }
        else{
            System.out.println("Plate is not empty");
        }

    }
    public void usingMicrowave(boolean heatTolerant)
    {
        if(heatTolerant)
        {
            System.out.println("You can use microwave");
        }
        else {
            System.out.println("You can not use microwave");
        }
    }
    public  void breaking(String MeterialType)
    {
        this.meterialType = MeterialType;
        if(MeterialType.equals("Glass"))
        {
            System.out.println("Take care when you take the plate beacuse it may be break");
        }
        else {
            System.out.println("Plate will not break");
        }
    }
}

