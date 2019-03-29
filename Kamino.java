package company.Arrays;
import java.util.Scanner;

public class Kamino {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int dnaLenght = Integer.parseInt(scanner.nextLine());

        String dnaSequence = "";
// Scanner scanner = new Scanner(System.in);
//        String input = scanner.next();
//
//        int words[] = input.split(' ');


        int counter =0;
        int max = 0;
        int first = 999999999;
        int number =0;
        int bestnumber =0;
        int leftsequence =0;



        String[] bestDNA = new String[dnaLenght];


        while (!"Clone them!".equals(dnaSequence = scanner.nextLine())){


            String[] DNA = dnaSequence.split("!");


            /*
            for (int i = 0; i <numbers.length ; i++) {
                count++;
                bestsequence = 0;
                for (int j = i; j <numbers.length ; j++) {
                    if (numbers[i] == numbers[j]) {
                        bestsequence++;
                        if (bestsequence > bestBestsequence){
                            bestBestsequence = bestsequence;
                            bestnumbers = numbers[i];
                        }
                    }
                    else {
                        break;
                    }
                }
            }
            */

            number++;
            bestnumber =0;
            leftsequence++;
            for (int i = 0; i < DNA.length ; i++) {

                counter=0;
                if (DNA[i].contains("1")){

                    counter++;
                }

            }
            if (counter > max){
                max = counter;
                bestnumber = number;
                bestDNA = DNA;
            }

        }
        System.out.printf("Best DNA sample %d with sum: %d.%n",bestnumber, max);
        for (String dnka :
                bestDNA) {

            System.out.printf(dnka +" ");
        }

    }
}
