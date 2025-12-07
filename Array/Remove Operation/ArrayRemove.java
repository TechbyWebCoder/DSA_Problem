// REMOVE Operation In Array


import java.util.Scanner;

public class ArrayRemove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[20];
        int size = 10;

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter position to remove (0 to " + (size - 1) + "): ");
        int pos = sc.nextInt();

        if (pos < 0 || pos >= size) {
            System.out.println("Invalid position!");
            sc.close();
            return;
        }

        for (int i = pos; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;

        System.out.print("Array after removal: ");
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");

        sc.close(); 
    }
}
