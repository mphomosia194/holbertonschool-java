import java.util.ArrayList;

public class Mobile {

    private ArrayList<Contact> contacts;

    public Mobile() {
        contacts = new ArrayList<Contact>();
    }

    public int getContactPosition(String name) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public void addContact(Contact contact) {
        if (getContactPosition(contact.getName()) != -1) {
            throw new IllegalArgumentException("Could not add contact. Contact with this name already exists");
        }
        contacts.add(contact);
    }

    public void updateContact(Contact oldContact, Contact newContact) {
        int position = getContactPosition(oldContact.getName());

        if (position == -1) {
            throw new IllegalArgumentException("Could not modify contact. Contact does not exist");
        }

        int existingPosition = getContactPosition(newContact.getName());
        if (existingPosition != -1 && !oldContact.getName().equals(newContact.getName())) {
            throw new IllegalArgumentException("Could not modify contact. Contact with this name already exists");
        }

        contacts.set(position, newContact);
    }

    public void removeContact(Contact contact) {
        int position = getContactPosition(contact.getName());

        if (position == -1) {
            throw new IllegalArgumentException("Could not remove contact. Contact does not exist");
        }

        contacts.remove(position);
    }

    public void listContacts() {
        for (Contact c : contacts) {
            System.out.println(c.getName() + " -> " + c.getPhoneNumber() + " (" + c.getType() + ")");
        }
    }
}
