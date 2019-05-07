package com.company.ClassAndObject.OrderByAge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input="";
        List<OrderAge> listOfPeople = new ArrayList<>();

        while (!"End".equals(input = scanner.nextLine())){

            String[] people = input.split( " ");
            String name = people[0];
            String ID = people[1];
            int age = Integer.parseInt(people[2]);


            OrderAge man = new OrderAge(name,ID,age);


            listOfPeople.add(man);

        }

        listOfPeople.stream()
                .sorted(Comparator.comparing(OrderAge::getAge))
                .forEach(System.out::println);


    }
}
