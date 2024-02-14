package phoneBook;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class SortingPhonebook {
    /**
     *
     * @return - возращает отсортированный контакт
     */
    public static List<String> sortContacts() {
        List<Map.Entry<String, TreeSet<String>>> sortedEntries = new ArrayList<>(PhoneBook.contacts.entrySet());
        sortedEntries.sort((e1, e2) -> e2.getValue().size() - e1.getValue().size());

        List<String> result = new ArrayList<>();
        for (Map.Entry<String, TreeSet<String>> entry : sortedEntries) {
            result.add(entry.getKey() + " : " + entry.getValue());
        }
        return result;
    }
}
