
// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
import java.util.LinkedList;

public class task1 {
    public static void main(String[] args) {
        int[] listMas = { 10, 4, 1, 3, 0, 6, 8, 9 };
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (Integer temp : listMas) {
            linkedList.add(temp);
        }

        int temp = 0;
        while (temp != linkedList.size() - 1) {
            linkedList.add(linkedList.size() - temp, linkedList.getFirst());
            linkedList.removeFirst();
            temp++;
        }

        System.out.println("reversedLinkedList = " + linkedList);
    }
}
