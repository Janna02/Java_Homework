package seminar_2;

// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.logging.Logger;

public class task2 {
    private static Logger logger = Logger.getLogger(task2.class.getName());

    public static void main(String[] args) {

        int arr[] = { 10, 46, 22, 15, 50, 201, 7 };

        try (PrintWriter out = new PrintWriter("bubbleSort.txt")) {

            int n = arr.length;
            int temp = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 1; j < n - i; j++) {
                    if (arr[j - 1] > arr[j]) {
                        temp = arr[j - 1];
                        arr[j - 1] = arr[j];
                        arr[j] = temp;
                    }
                }
                out.println(Arrays.toString(arr));
            }

            logger.info("Результаты отработки итераций пузырьковой сортировки записаны в файл bubbleSort.txt");
        } catch (FileNotFoundException e) {
            logger.info(e.getMessage());
        }

    }
}
