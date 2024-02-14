package phoneBook;

import java.util.TreeSet;

public class RemoveContact {
    /**
     *
     * @param name - имя контакта на удаление
     */
    public static void removeContact(String name) {
        TreeSet<String> phones = PhoneBook.contacts.getOrDefault(name, new TreeSet<>());
        PhoneBook.contacts.remove(name);
        System.out.println("Удален контакт: " + name);
    }
}
