import java.util.ArrayList;

public class MobilePhone{
    //Instance Field
    private String myNumber;
    private ArrayList <Contact> myContacts;
    //Constructor Field:
    public MobilePhone(String myNumber){
        myNumber = this.myNumber;
        this.myContacts = new ArrayList<Contact>();
    }
    
    public boolean addNewContact(Contact contact){
        if(findContact(contact.getName()) >= 0){
            System.out.println("Contact is already on File");
            return false;
        }
        myContacts.add(contact);
        return true;
    }
    public String queryContact(Contact contact){
        if(findContact(contact) >= 0){
            return contact.getName();
        }
        return null;
    }

    //////////////////////////////////////////////////////////////////
    //My heart is skewered into 4000 pieces. Zairah all I want is you.
    //////////////////////////////////////////////////////////////////

    public Contact queryContact(String name){
        int position = findContact(name);
        if(position >= 0) {
            return this.myContacts.get(position);
        }
        return null;
    }
    public boolean removeContact(Contact contact){
        //How do i check if this exists first:
        int foundPosition = findContact(contact);
        if(foundPosition < 0){
            System.out.println("Could not find Contact: " + contact.getName());
            return false;
        }else{
            myContacts.remove(foundPosition);
            System.out.println(contact.getName() + " was deleted. ");
            return true;
        }
    }
    private int findContact(Contact contact){
        return this.myContacts.indexOf(contact);
    }
    private int findContact(String contactName){
        for(int i = 0; i < this.myContacts.size(); i++){
            //It acts like a getter: Getting the element from the ArrayList
            Contact contact = this.myContacts.get(i);
            if(contact.getName().equals(contactName)){
                //Then I want you to return me the position of that contact in the Array
                return (i);
            } 
        }
        return -1;
    }
    public boolean updateContact(Contact oldContact, Contact newContact){
        //This should return a value above 1
        int foundPosition = findContact(oldContact);
        if(findContact(oldContact) < 0){
            System.out.println(oldContact.getName() + " was not found");
            return false;
        }else{
            //I want to add the contact in that element position:
            myContacts.set(foundPosition, newContact);
            System.out.println(oldContact.getName() + " was replaced by " + newContact.getName());
            return true;
        }

    }
    public void printContacts(){
        //Print the Array Contacts.. Access MyContacts
        System.out.println("Contact List");
        for(int i = 0; i < this.myContacts.size(); i++){
            System.out.println(i + 1 + ". " + this.myContacts.get(i).getName() + ": " + this.myContacts.get(i).getPhoneNumber());
        }
    }
    
}