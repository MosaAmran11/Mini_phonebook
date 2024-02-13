public class MobilePhone {
    private DoublyLinkedList<Contact> contacts;

    public MobilePhone() {
        contacts = new DoublyLinkedList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void removeContact(Contact contact) {
        contacts.remove(contact);
    }

    public Contact searchContactByPhoneNumber(String phoneNumber) {
        for (Contact contact : contacts) {
            if (contact.getPhoneNumber().equals(phoneNumber)) {
                return contact;
            }
        }
        return null;
    }

    public Contact searchContactByName(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                return contact;
            }
        }
        return null;
    }

    public void printContacts() {
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }
}
