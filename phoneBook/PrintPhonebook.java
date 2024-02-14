package phoneBook;
import java.util.TreeSet;

public class PrintPhonebook {
    public static void printContacts() {
        for (String name : PhoneBook.contacts.keySet()) {
            TreeSet<String> phones = PhoneBook.contacts.get(name);
            System.out.println(name + " : " + phones);
        }
    }
}
