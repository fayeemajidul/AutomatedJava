public class Contact{
    //Instance Field:
    private String name; private String phoneNumber;
    //Constructor Method:
    public Contact(String name, String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    public Contact(String phoneNumber){
        this("Name not entered", phoneNumber);
    }
    public Contact(){
        this("Name Not Entered", "Invalid Phone Number");
    }
    //Accessor Methods:
    public String getName() {
        return name;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public static Contact createContact(String name, String phoneNumber){
        return new Contact(name, phoneNumber);
    } 
}