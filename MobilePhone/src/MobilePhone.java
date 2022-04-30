import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact){
        if (findContact(contact.getName()) >= 0){
            System.out.println("Contact already exists.");
            return false;
        }
        myContacts.add(contact);
        System.out.println("New contact added.");
        return true;
    }

    private int findContact(Contact contact){
        return this.myContacts.indexOf(contact);
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        if (findContact(oldContact) < 0){
            System.out.println(oldContact.getName() + ", was not found.");
            return false;
        }
        this.myContacts.set(findContact(oldContact),newContact); // felcsereli a regit az ujjal
        System.out.println(oldContact.getName() + " was replaced with " + newContact.getName());
        return true;
    }

    public boolean removeContact(Contact contact){
        if (findContact(contact) >= 0){
            myContacts.remove(contact);
            System.out.println(contact.getName() + " was deleted.");
            return true;
        }

        System.out.println(contact.getName() + " was not found.");
        return false;
    }
    private int findContact(String contactName){
        for (int i = 0; i < myContacts.size(); i++){
            Contact contact = myContacts.get(i);
            if (contact.getName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String contact){
       if (findContact(contact) >= 0){
           return myContacts.get(findContact(contact)); // visszateriti a poziciojat a kontaktnak
       }
       return null;
    }

    public void printContacts() {
        System.out.println("Contact List:\n");
        for (int i = 0; i < myContacts.size(); i++){
            System.out.println((i + 1) + "." + myContacts.get(i).getName() + " -> " +
                                                myContacts.get(i).getPhoneNumber());
        }
    }









}
