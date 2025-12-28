// SORT Operation In BinaryHeap

public class HeapSort {
    static int[] heap = {50, 30, 40, 10, 20, 35};
    static int size = heap.length;

    public static void heapify(int i, int n) {
        int largest = i;
        int left = 2*i + 1;
        int right = 2*i + 2;

        if (left < n && heap[left] > heap[largest])
            largest = left;

        if (right < n && heap[right] > heap[largest])
            largest = right;

        if (largest != i) {
            int t = heap[i];
            heap[i] = heap[largest];
            heap[largest] = t;
            heapify(largest, n);
        }
    }

    public static void heapSort() {
        // Build heap
        for (int i = size/2 - 1; i >= 0; i--)
            heapify(i, size);

        // Sort
        for (int i = size - 1; i > 0; i--) {
            int temp = heap[0];
            heap[0] = heap[i];
            heap[i] = temp;
            heapify(0, i);
        }
    }

    public static void main(String[] args) {
        heapSort();

        System.out.println("Sorted array:");
        for (int x : heap)
            System.out.print(x + " ");
    }
}
