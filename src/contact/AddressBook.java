package contact;

import java.util.*;

public class AddressBook {
    private List<Contact> contacts = new ArrayList<>();

    public AddressBook() {
        this.contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        this.contacts.add(contact);
    }

    public void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("연락처가 비어있습니다.");
        } else {
            for (Contact contact : contacts) {
                System.out.println(contact);
            }
        }
    }

    public void searchContact(String name) {
        boolean isExist = false;
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                System.out.println(contact);
                isExist = true;
            }
        }
        if (!isExist) {
            System.out.println("연락처를 찾을 수 없습니다.");
        }
    }
}