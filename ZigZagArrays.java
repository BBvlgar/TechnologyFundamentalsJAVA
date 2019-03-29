package company.Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int index = 0;

        String[] numbers = new String[n * 2];
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");

            if(i % 2 == 0){
                numbers[index++] = input[0];
                numbers[index++] = input[1];
            }else{
                numbers[index++] = input[1];
                numbers[index++] = input[0];

            }
        }
        String firstInput = "";
        String secondInput = "";
        for (int i = 0; i < numbers.length; i++) {
            if(i % 2 == 0){
                firstInput += numbers[i] + " ";
            }else {
                secondInput += numbers[i] + " ";
            }
        }
        System.out.println(firstInput);
        System.out.println(secondInput);
    }
}


