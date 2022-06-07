import java.util.Scanner;

public class JuneSixthChallengeTwo {

    // Week One - Challenge Two
// Given an alphanumeric string made up of digits and lower case latin characters only,
// find the sum of all the digit characters in the string.
// INPUT:
//  1
//  ab1231da
// OUTPUT:
//  7

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input text: ");
        String text = scanner.nextLine();

        String numString = text.replaceAll("[^0-9]", "");

        int sum = 0;
        for (int i = 0; i < numString.length(); i++) {
            sum += numString.charAt(i) - 48;
        }

        System.out.println(sum);
    }
}


