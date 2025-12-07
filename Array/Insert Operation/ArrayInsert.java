// INSERT Operation In Array

import java.util.Scanner;

public class ArrayInsert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[20];
        int size = 10;

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter value to insert: ");
        int value = sc.nextInt();
        System.out.print("Enter position (0 to " + size + "): ");
        int pos = sc.nextInt();

        if (pos < 0 || pos > size) {
            System.out.println("Invalid position!");
            sc.close();
            return;
        }

        for (int i = size - 1; i >= pos; i--) {
            arr[i + 1] = arr[i];
        }

        arr[pos] = value;
        size++;

        System.out.print("Array after insertion: ");
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");

        sc.close();  
    }
}
