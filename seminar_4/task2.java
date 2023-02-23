
// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент 
// из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.

import java.util.LinkedList;

public class task2 {
    public static void main(String[] args) {
        int[] list = { 1, 3, 8, 4, 2, 5 };

        LinkedList<Integer> llist = new LinkedList<>();
        for (Integer temp : list) {
            llist.add(temp);
        }
        System.out.println(llist);

        enqueue(llist, 4);
        System.out.println(llist);

        System.out.print(dequeue(llist) + " ");
        System.out.println(llist);

        System.out.print(first(llist) + " ");
        System.out.println(llist);
    }

    private static void enqueue(LinkedList<Integer> list, int num) {
        list.addLast(num);
    }

    private static int dequeue(LinkedList<Integer> list) {
        int num = 0;
        num = list.get(0);
        list.remove(0);
        return num;
    }

    private static int first(LinkedList<Integer> list) {
        int num = 0;
        num = list.get(0);
        return num;
    }

}
