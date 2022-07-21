public class IDcard{
    //Instance Field:
    int IDnumber; String firstName; String lastName; String address;

    //Default Constructor: When parameters are not entered

    public IDcard(){
        this(1234, "John", "Doe", "123 Main street");
    }
    public IDcard(int IDnumber, String firstName, String lastName, String address){
        this.IDnumber = IDnumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }
    
}