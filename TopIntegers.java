package company.Arrays;
import java.util.Scanner;


public class TopIntegers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] input = scanner.nextLine().split(" ");

        int []numbers = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        for (int i = 0; i < numbers.length; i++) {
            boolean isGreater = true;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] <= numbers[j]) {
                    isGreater = false;
                    break;
                }
            }
            if(isGreater) {
                System.out.print(numbers[i] + " ");
            }
        }
    }
}
