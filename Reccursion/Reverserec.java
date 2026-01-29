import java.util.Scanner;
public class Reverserec {
    
    static void reverse(int[] arr, int i) {
        // Base condition
        if (i < 0)
            return;

        // Print current element
        System.out.print(arr[i] + " ");

        // Recursive call
        reverse(arr, i - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Reversed Array:");
        reverse(arr, n - 1);
    }


}
