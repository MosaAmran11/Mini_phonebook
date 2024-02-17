public class MobilePhone {
    private DoublyLinkedList<Contact> contacts;
    private StackDeque<Contact> deletedContacts;

    public MobilePhone() {
        contacts = new DoublyLinkedList<>();
        deletedContacts = new StackDeque<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void removeContact(String name) {
        Contact contact = searchContactByName(name);
        deletedContacts.push(contacts.remove(contact));
    }

    
    public Contact restoreContact() {
        Contact restored = deletedContacts.pop();
        contacts.add(restored);
        return restored;
    }

    public Contact searchContactByPhoneNumber(String phoneNumber) {
        for (int i = 0; i < contacts.size(); i++) {
            Contact contact = contacts.get(i);
            if (contact.getPhoneNumber().equals(phoneNumber)) {
                return contact;
            }
        }
        return null;
    }

    public Contact searchContactByName(String name) {
        for (int i = 0; i < contacts.size(); i++) {
            Contact contact = contacts.get(i);
            if (contact.getName().equals(name)) {
                return contact;
            }
        }
        return null;
    }

    public void printContacts() {
        for (int i = 0; i < contacts.size(); i++) {
            System.out.println(contacts.get(i));
        }
    }
}
