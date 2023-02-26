package seminar_5;
// Реализовать алгоритм пирамидальной сортировки (HeapSort).
public class task3 {
    public static void main(String[] args) {
        int arr[] = {15, 13, 2, 4, 7, 11};
        int n = arr.length;

        task3 ob = new task3();
        ob.sort(arr);

        System.out.println("Sorted array is");
        printArray(arr);

    }
    private void sort(int arr[]) {
        int n = arr.length;

        // group array
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        // take out elements
        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            
            heapify(arr, i, 0);
        }
    }

    private void heapify(int arr[], int n, int i) {
        int largest = i; 
        int l = 2 * i + 1; // 2*i + 1
        int r = 2 * i + 2; // 2*i + 2

        // left child
        if (l < n && arr[l] > arr[largest])
            largest = l;

        // right child
        if (r < n && arr[r] > arr[largest])
            largest = r;
        // largest element is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            
            heapify(arr, n, largest);
        }
    }

    private static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
