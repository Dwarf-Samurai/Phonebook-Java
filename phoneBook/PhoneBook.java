package phoneBook;
import java.util.*;

public class PhoneBook {
    public static HashMap<String, TreeSet<String>> contacts;

    public PhoneBook() {
        contacts = new HashMap<>();
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        AddingContact.addContact("Danil", "123");
        AddingContact.addContact("Danil", "731");
        AddingContact.addContact("Ivan", "543");
        AddingContact.addContact("Jon", "321");
        AddingContact.addContact("Kiril", "543");
        AddingContact.addContact("Danil", "321");
        AddingContact.addContact("Kiril", "243");
        PrintPhonebook.printContacts();

        RemoveContact.removeContact("Jon");

        List<String> sortedContacts = SortingPhonebook.sortContacts();
        System.out.println("Сортировка контактов: ");
        for (String contact : sortedContacts) {
            System.out.println(contact);
        }
    }
}
