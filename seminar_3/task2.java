package seminar_3;

// Пусть дан произвольный список целых чисел. Удалить из него чётные числа.
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class task2 {
    public static void main(String[] args) {
        delEven();
    }

    private static void delEven() {
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            Random random = new Random();
            int val = random.nextInt(15);
            array.add(val);
        }
        System.out.println(array);
        for (int i = 0; i < array.size();) {
            if (array.get(i) % 2 == 0) {
                array.remove(i);
            } else {
                i++;
            }
        }
        System.out.println(array);
    }

}
