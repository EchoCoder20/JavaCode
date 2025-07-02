public class WaterSensor {
    boolean isUsed;
    boolean isDry;
    boolean functional;
    public void waterSensitivity(boolean isDry,boolean isFunctional)
    {
        if(isFunctional && !isDry)
        {
            isUsed = false;
        }
        else if(!isFunctional && !isDry)
        {
            isUsed = false;
        }
        else{
            isUsed = true;
        }
    }
}
