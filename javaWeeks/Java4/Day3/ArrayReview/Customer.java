//Within this class you should store, customers name, customers details information along with book preferences.
//Each Customer should have a book list where you can get the book list and return it.
//Create fucntions of FindBookList or edit booklist: Review arrays concepts:

import java.util.ArrayList;
import java.util.LinkedList;

public class Customer {
    private String userName;
    private ArrayList <Books> bookList;
    
    public Customer(String userName){
        this.userName = userName;
        bookList = new ArrayList<Books>();
    }
    
    //Add Book Function:
    public boolean addBook(String bookName, String authorName, int bookNumber){
        /** If Null == Means book already in the list do nothing return false. If not then add it to the list, use the construct and add it. */
        if(findBook(bookName) == null){
            return false;
        }else{
            //Utilizes Constructor:
            //Add this 
            bookList.add(new Books(bookName, authorName, bookNumber));
        }
        return false;
    }
    //Find Book Function:
    public Books findBook(String bookName){
        for(Books checkBook : this.bookList){
            if(checkBook.getBookName().equals(bookName)){
                return checkBook;
            }
        }
        return null;
    }
    

}
//highfrequency codin