import java.util.Scanner;

public class MoveZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int[] result = new int[n];

        int index = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] != 0) {
                result[index] = arr[i];
                index++;
            }
        }

        System.out.print("Array after moving zeros: ");
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}