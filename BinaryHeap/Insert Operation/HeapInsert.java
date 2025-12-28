// INSERT Operation In BinaryHeap

import java.util.Scanner;

public class HeapInsert {
    static int[] heap = new int[20];
    static int size = 0;

    public static void insert(int value) {
        heap[size] = value;
        int i = size;
        size++;

        while (i > 0 && heap[(i - 1) / 2] < heap[i]) {
            int temp = heap[i];
            heap[i] = heap[(i - 1) / 2];
            heap[(i - 1) / 2] = temp;
            i = (i - 1) / 2;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter heap values:");
        for (int i = 0; i < n; i++) {
            insert(sc.nextInt());
        }

        System.out.println("Heap after insertions:");
        for (int i = 0; i < size; i++)
            System.out.print(heap[i] + " ");

        sc.close();
    }
}

