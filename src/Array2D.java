import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rowSize = sc.nextInt();
        int colSize = sc.nextInt();

        int[][] arr2d = new int[rowSize][colSize];

        for(int i=0; i<rowSize; i++) {
            for(int j=0; j<colSize; j++) {
                arr2d[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<rowSize; i++) {
            for(int j=0; j<colSize; j++) {
                System.out.print(arr2d[i][j] + " ");
            }
            System.out.println();// just a new line
        }

    }
}
