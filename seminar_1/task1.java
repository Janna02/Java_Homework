// Вычислить n-ое треугольного число(сумма чисел от 1 до n

package seminar_1;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Введите число : ");
        int a = Scanner.nextInt();
        Scanner.close();
        System.out.println("Треугольное число = " + Triangle(a) + "\n");
    }

    public static int Triangle(int num) {
        if (num == 1) {
            return 1;
        }
        return Triangle(num - 1) + num;
    }
}
