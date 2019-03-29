package company.Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        int n = Integer.parseInt(scanner.nextLine());
        int people =0;


        int sum=0;

        for (int i = 0; i <n ; i++) {
            people = Integer.parseInt(scanner.nextLine());

            System.out.print(people);

            sum +=people;
            System.out.println();

        }

        System.out.printf("%d",sum);



    }




}
