package seminar_5;
import java.util.*;
// Пусть дан список сотрудников: Иван, Пётр, Антон и так далее. Написать программу, которая найдет
//  и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.
public class task2 {
    public static void main(String[] args) {
        List<String> listOfEmployees = new ArrayList<>();

        addEmployeeNames(listOfEmployees, new String[] {
                "Карина", "Карина", "Карина", "Карина",
                "Давина", "Давина", "Петро", "Петро",
                "Геннадий", "Геннадий", "Геннадий", "Геннадий",
                "Регина", "Регина", "Регина", "Регина",
                "Кирилл", "Иван","Владимир","Марго"
        });

        System.out.println(countOfNamesInTheList(listOfEmployees));
    }
    private static TreeMap<String, Integer> countOfNamesInTheList(List<String> names) {
        HashMap<String, Integer> result = new HashMap<>();
        for (String name : names) {
            if (result.containsKey(name)) {
                result.replace(name, result.get(name) + 1);
            } else {
                result.put(name, 1);
            }
        }
        TreeMap<String, Integer> sorted = new TreeMap<>(result);
        return sorted;
    }

    private static void addEmployeeNames(List<String> listOfEmployees, String[] newEmployeeNames) {
        Collections.addAll(listOfEmployees, newEmployeeNames);
    }
}
