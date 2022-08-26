//Adds indiviual Book element into an Array.

public class Books {
    
    //Instance Field:

    private String bookName;
    private String authorName;
    private int bookNumber;

    public Books(String bookName, String authorName, int bookNumber){
        this.bookName = bookName;
        this.authorName = authorName; 
        this.bookNumber = bookNumber;
    }
    public String getAuthorName() {
        return authorName;
    }
    public String getBookName() {
        return bookName;
    }
    public int getBookNumber() {
        return bookNumber;
    }
    @Override
    public String toString(){
        return "ISBN:" + bookNumber + " " + authorName + ", " + bookName + ".";
    }
}
