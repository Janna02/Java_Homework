package seminar_3;

// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметичское этого списка.
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class task3 {
    public static void main(String[] args) {
        findMaxMinMean();
    }

    private static void findMaxMinMean() {
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            Random random = new Random();
            int val = random.nextInt(15);
            array.add(val);
        }
        System.out.println(array);
        Collections.sort(array);
        System.out.println(array.get(0));
        System.out.println(array.get(array.size() - 1));
        System.out.println(array.get(array.size() / 2));
    }
}
