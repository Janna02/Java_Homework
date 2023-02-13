package seminar_1;

import java.util.Scanner;

public class task1_2 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Введите число : ");
        int a = Scanner.nextInt();
        Scanner.close();
        System.out.println("Треугольное число = " + Triangle(a) + "\n");
    }

    public static int Triangle(int num) {
        int Tnum = (num + 1) * num / 2;
        return Tnum;
    }
}
