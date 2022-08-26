public class DeskClass {
    //Instance Field
    //Constructor Method
    int numberOfSeats;
    int booksOnTable;
    People person;

    public DeskClass(int numberOfSeats, int booksOnTable, People person){
        this.numberOfSeats = numberOfSeats; 
        this.booksOnTable = booksOnTable;
        this.person = person;
    }
    public void Chair(){
        System.out.println("You Want to sit, lets sit");
    }
    public void SeatingFeature(){
        System.out.println("Please sitdown");
    }
    public void personStudying(){
        person.studyinFeature();
    }
}
