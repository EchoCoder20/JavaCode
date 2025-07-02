public class NoteBook {
    int size;
    int numberofPages;
    boolean hasLines;
    boolean isCovered;
    public void writing(int numberofPages, boolean hasLines)
    {
        this.numberofPages = numberofPages;
        if(numberofPages==0)
        {
            System.out.println("You dont have enough pages to write");
        }
        else
        {
            System.out.println("You have" + numberofPages+ " pages to write");
        }
        if(hasLines)
        {
            System.out.println("NoteBook used for writing");
        }
        else
        {
            System.out.println("NoteBook used for Drawing");
        }
    }
}
