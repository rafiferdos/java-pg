import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Factorial f = new Factorial();
        System.out.println(f.factorial(n));
    }
    public int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n-1);
    }
}
