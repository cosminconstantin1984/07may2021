package com.company;

public class Main {

    public static void main(String[] args) {
	   /*LocalDate today=LocalDate.now();
        LocalDate birthdate=LocalDate.of(1984,7,9);
        int years=Period.between(birthdate,today).getYears();
        System.out.println(today);
        System.out.println(birthdate);
        System.out.println(years);*/

        var scanner = new java.util.Scanner(System.in);
        System.out.print("What is the current year? ");
        int year = scanner.nextInt() + 1;
        int count = 0;
        while (count < 20) {
            if (year % 4 == 0) {
                if (year % 100 != 0 || year % 400 == 0) {
                    ++count;
                    System.out.println(year);
                }
            }
            ++year;
        }
    }
}
