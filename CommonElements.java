package company.Arrays;
import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String first = scanner.nextLine();
        String second = scanner.nextLine();

        String[] firstArray = first.split(" ");
        String[] secondArray = second.split(" ");

        for (int i = 0; i <firstArray.length ; i++) {

            for (int j = 0; j <secondArray.length ; j++) {

                if (firstArray[i].equals(secondArray[j])){

                    System.out.printf("%s ",firstArray[i]);
                }

            }

        }
    }
}
