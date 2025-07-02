public class Horse {
    boolean isTrained;
    String type;

    public void racing(boolean isTrained ){
        this.isTrained = isTrained;

        if(isTrained )
        {
            System.out.println("Horse can particaipte for racing");
        }
        else {
            System.out.println("Horse can not particaipte for racing");
        }
    }
    public void riding(String type){
        this.type = type;
        if(type.equals("Ponies"))
        {
            System.out.println("Child can ride the horse");
        }
        else
        {
            System.out.println("Child cannot ride the horse");
        }
    }
}
