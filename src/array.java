// import java.util.ArrayList;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        int[] arr = new int[3]; // declaration with creation
        // arr[0] = 43;
        // arr[1] = 54;
        Scanner sc = new Scanner(System.in);
        // arr[0] = sc.nextInt();
        // arr[1] = sc.nextInt();
        for (int i : arr) {
            arr[i] = sc.nextInt(); // loop that goes through the array
        }
        // System.out.println(arr[3]); // prints out the value at index 3
    }
}