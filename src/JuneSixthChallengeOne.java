import java.util.Arrays;
import java.util.Scanner;

public class JuneSixthChallengeOne {

    public static void main(String[] args) {

// Week One - Challenge One
// Write a program that accepts sets of three numbers and prints the second-maximum number among the three
// INPUT:
//      3
//      1 2 3
//      10 15 5
//      100 999 500
//
// OUTPUT:
//      2
//      10
//      500


        Scanner scanner = new Scanner(System.in);

        System.out.println("Input number of triples: ");
        int n = scanner.nextInt();

        int[][] numbers = new int[n][3];

        for (int i = 0; i < n; i++) {
            System.out.println("Input triple: ");
            for (int j = 0; j < 3; j++) {
                numbers[i][j] = scanner.nextInt();
            }
        }


        int[] middles = new int[n];

        for (int i = 0; i < n; i++) {
            int[] sortable = {numbers[i][0], numbers[i][1], numbers[i][2]};
            Arrays.sort(sortable);
            middles[i] = sortable[1];
        }

        for (int i = 0; i < n; i++) {
            System.out.println(middles[i]);
        }
    }
}
