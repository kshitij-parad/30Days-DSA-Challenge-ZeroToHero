
import java.util.Scanner;

public class P03_IsArraySorted {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] inp = new int[5];

        System.out.print("Enter Elements: ");

        for (int i = 0; i < inp.length; i++) {
            inp[i] = sc.nextInt();
        }

        boolean isSorted = true;
        for (int i = 0; i < inp.length - 1; i++) {
            if (inp[i] > inp[i + 1]) {
                isSorted = false;
                 break;
            }
        }


        if (isSorted) {
            System.out.println("Sorted");
        } else {
            System.out.println("Not Sorted");
        }

    }
}
