import java.util.Scanner;

public class reccursion {

    static void printNumbers(int n) {
        if (n == 0) {      // base condition
            return;
        }
        printNumbers(n - 1);   // recursive call
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();

        printNumbers(n);
    }
}
