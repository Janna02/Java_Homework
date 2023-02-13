// Вывести все простые числа от 1 до 1000

package seminar_1;

public class task2 {
    public static void main(String[] args) {
        Numbers();
    }

    public static void Numbers() {
        for (int j = 2; j <= 1000; j++) {
            boolean NumIsSimple = false;

            for (int i = 2; i * i <= j; i++) {
                NumIsSimple = (j % i == 0);
                if (NumIsSimple) {
                    break;
                }
            }
            if (!NumIsSimple) {
                System.out.print(j + " ");
            }

        }
    }
}
