package seminar_1;

import java.util.Scanner;

// Реализовать простой калькулятор Введите число 2 Введите операцию 1 + 2 - 3 * 4 / Введите число 2 2 + 2 = 4 

public class task3 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Введите 2 числа : ");
        int a = Scanner.nextInt();
        int b = Scanner.nextInt();
        int result = Calc(a, b, getOperation());
        System.out.println(result);
        Scanner.close();

    }

    public static char getOperation(){
        Scanner Scanner1 = new Scanner(System.in);
        System.out.print("Выберете операцию +; -; *;/: ");
        char operation;
        if(Scanner1.hasNext()){
            operation = Scanner1.next().charAt(0);
        } else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            Scanner1.next();
            operation = getOperation();
        }
        return operation;
    }

    public static int Calc(int num1, int num2, char operation){
        int result;
        switch (operation){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                result = Calc(num1, num2, getOperation());
        }
        return result;
    }

}
