package phoneBook;
import java.util.*;


public class AddingContact {

    /**
     * @param name         - Имя пользователя
     * @param numbersPhone - Номер телефона
     */
    public static void addContact(String name, String numbersPhone) {
        TreeSet<String> phones = PhoneBook.contacts.getOrDefault(name, new TreeSet<>());
        phones.add(numbersPhone);
        PhoneBook.contacts.put(name, phones);
    }
}

