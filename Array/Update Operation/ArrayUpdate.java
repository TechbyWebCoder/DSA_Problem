// UPDATE Operation In Array

import java.util.Scanner;

public class ArrayUpdate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[20];
        int size = 10;

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter position to update (0 to " + (size - 1) + "): ");
        int pos = sc.nextInt();

        if (pos < 0 || pos >= size) {
            System.out.println("Invalid position!");
            sc.close();
            return;
        }

        System.out.print("Enter new value: ");
        int newValue = sc.nextInt();

        arr[pos] = newValue;

        System.out.print("Array after update: ");
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");

        sc.close(); 
    }
}
