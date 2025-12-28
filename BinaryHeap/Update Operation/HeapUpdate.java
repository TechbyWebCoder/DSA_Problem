// UPDATE Operation In BinaryHeap

import java.util.Scanner;

public class HeapUpdate {
    static int[] heap = {50, 30, 40, 10, 20, 35};
    static int size = 6;

    public static void update(int pos, int newValue) {
        int oldValue = heap[pos];
        heap[pos] = newValue;

        if (newValue > oldValue) {
            // Percolate Up
            while (pos > 0 && heap[pos] > heap[(pos - 1) / 2]) {
                int t = heap[pos];
                heap[pos] = heap[(pos - 1) / 2];
                heap[(pos - 1) / 2] = t;
                pos = (pos - 1) / 2;
            }
        } else {
            // Percolate Down
            int i = pos;
            while (2 * i + 1 < size) {
                int left = 2 * i + 1;
                int right = 2 * i + 2;
                int largest = left;

                if (right < size && heap[right] > heap[left])
                    largest = right;

                if (heap[i] < heap[largest]) {
                    int t = heap[i];
                    heap[i] = heap[largest];
                    heap[largest] = t;
                    i = largest;
                } else break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter position to update (0–" + (size - 1) + "): ");
        int pos = sc.nextInt();

        System.out.println("Enter new value:");
        int newVal = sc.nextInt();

        update(pos, newVal);

        System.out.println("Heap after update:");
        for (int x : heap) System.out.print(x + " ");

        sc.close();
    }
}
