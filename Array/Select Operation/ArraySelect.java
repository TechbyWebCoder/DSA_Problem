// SELECT Operation In Array

import java.util.Scanner;

public class ArraySelect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[20];
        int size = 10;

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter value to search: ");
        int value = sc.nextInt();
        boolean found = false;
        int index = -1;

        for (int i = 0; i < size; i++) {
            if (arr[i] == value) {
                found = true;
                index = i;
                break;
            }
        }

        if (found)
            System.out.println("Value found at index: " + index);
        else
            System.out.println("Value not found!");

        sc.close(); 
    }
}
