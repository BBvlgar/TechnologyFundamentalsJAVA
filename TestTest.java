package company.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TestTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);




        // 123!32!45

        int[] numbers = Arrays.stream(scanner.nextLine().split("!"))
                .mapToInt(d -> Integer.parseInt(d))
                .toArray();

        int sum =0;
        for (int i = 0; i <numbers.length ; i++) {

            System.out.printf("%d %d ",numbers[i],sum +=numbers[i]);
        }


    }
}
