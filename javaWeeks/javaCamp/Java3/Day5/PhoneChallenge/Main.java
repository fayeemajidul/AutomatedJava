import java.util.Scanner;

public class Main{
    //Instance Field:
    private static Scanner scanner = new Scanner(System.in);
    static boolean quit = false;
    static MobilePhone mobilePhone = new MobilePhone("914 454 0222");
    //Constructor Field:
    public Main(){}
    private static void startPhone(){
        System.out.println("Starting Phone. . .");
    }
    public static void printActions(){
        System.out.println("\nAvailable actions: \npress");
        System.out.println("0 - to shutdown\n" + "1 - to print contacts\n" + "2 - to add a new contact\n" + "3 - to update an existing contact\n" + "4 - to remove an existing contact\n" + "5 - query if an existing contact exists\n" + "6 - to print a list of avaiable actions.");
        System.out.println("Choose your action: ");
    }
    public static void addNewContact(){
        System.out.println("Enter new contact name");
        String name = scanner.nextLine();
        System.out.println("Enter phone number : ");
        String phone = scanner.nextLine();
        Contact newContact = Contact.createContact(name, phone);
        if(mobilePhone.addNewContact(newContact) == true){
            System.out.println("New Contact added Name: " + name + "\nPhone: " + phone);
        }else{
            System.out.println("Can not add contact, " + name + " already on file");
        }
    }
    private static void updateContact(){
        System.out.println("Enter existing contact name");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord == null){
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new contact phone number:");
        String newNumber =  scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newNumber);
        if(mobilePhone.updateContact(existingContactRecord, newContact)){
            System.out.println("Successfully updated record");
        }else{
            System.out.println("Error updating record");
        }
    }
    private static void removeContact(){
        System.out.println("Enter existing contact name");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord == null){
            System.out.println("Contact not found");
            return;
        }
        if(mobilePhone.removeContact(existingContactRecord)){
            System.out.println("Successfully deleted");
        }else{
            System.out.println("Error deleting contact");
        }
    }
    private static void queryContact(){
        System.out.println("Enter existing contact name");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord == null){
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Name: " + existingContactRecord.getName() + "Phone : " + existingContactRecord.getPhoneNumber());
    }

    public static void main(String[] args) {
        //GUI is just a loop until executed false WOW :o
        while(!quit) {
            System.out.println("\nEnter action: (6: to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch(action){
                case 0:
                    System.out.println("Shutting Down . . .");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }
        startPhone();
        printActions();
    }
}