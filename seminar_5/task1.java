package seminar_5;

// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что один человек может иметь несколько телефонов.
import java.util.HashMap;
import java.util.Map;

public class task1 {
    public static void main(String[] args) {
        Map<String, String> bookPhone = new HashMap<>();
        
        bookPhone.put("Иванов", "7-958-56-55-56");
        bookPhone.put("Петров", "7-958-55-55-56");
        bookPhone.put("Сидоров", "7-958-56-54-56");
        bookPhone.put("Смирнов", "7-958-53-55-56");
        bookPhone.put("Горшков", "7-958-56-52-56, 7-958-56-51-56");
        bookPhone.put("Николаев", "7-958-56-50-56");
        bookPhone.put("Карпов", "7-958-56-55-51, 7-958-56-55-50");

        System.out.println(bookPhone.get("Иванов"));
        System.out.println(bookPhone.get("Петров"));

        addPhoneBook(bookPhone, "Смуглов", "7-948-56-55-50");

        System.out.println(bookPhone.get("Смуглов"));

        deletePhoneBook(bookPhone, "Николаев");

        System.out.println(bookPhone);
    }

    
    private static void addPhoneBook(Map<String, String> dict, String name, String number) {
        dict.put(name, number);
    }

   
    private static void deletePhoneBook(Map<String, String> dict, String name) {
        dict.remove(name);
    }
}
