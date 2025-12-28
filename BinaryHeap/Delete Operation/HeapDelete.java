// DELETE Operation In BinaryHeap

public class HeapDelete {
    static int[] heap = {50, 30, 40, 10, 20, 35};
    static int size = 6;

    public static void deleteRoot() {
        heap[0] = heap[size - 1];
        size--;

        int i = 0;

        while (2 * i + 1 < size) {
            int left = 2*i + 1;
            int right = 2*i + 2;
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

    public static void main(String[] args) {
        deleteRoot();

        System.out.println("Heap after deleting root:");
        for (int i = 0; i < size; i++)
            System.out.print(heap[i] + " ");
    }
}
