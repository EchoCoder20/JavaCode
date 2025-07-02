public class Arduino {
    String type;
    int numberofPins;
    boolean isOriginal;
    boolean isConnected;
    public void programmed( String boardType,boolean isConnected )
    {
        this.type = boardType;
        this.isConnected = isConnected;
        if(isConnected)
        {
            System.out.println("You must select"+ boardType+" board from the tool meun");
            if(boardType.equals("Arduino uno"))
            {
                this.numberofPins=18;
            }
            else
            {
                this.numberofPins=17;
            }
        }
        else
        {
            System.out.println("You need to connect the board first");
        }

    }
    public void arduinoFunction(boolean isConnected)
    {
        if(isConnected)
        {
            System.out.println("You can restart the arduino and validate the code");
        }
        else
        {
            System.out.println("You can not restart the arduino and validate the code");

        }
    }

}
