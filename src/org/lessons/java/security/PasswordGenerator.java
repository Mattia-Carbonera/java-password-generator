package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {

        // DICHIARO LE VARIABILI
        String name;
        String surname;
        String favouriteColor;
        int day;
        int month;
        int year;

        // RECUPERO I DATI
        Scanner inputUser = new Scanner(System.in);
        name = inputUser.nextLine();
        surname = inputUser.nextLine();
        favouriteColor = inputUser.nextLine();
        day = inputUser.nextInt();
        month = inputUser.nextInt();
        year = inputUser.nextInt();


        // STAMPO LA PASSWORD
        System.out.println("Password: " + name + surname + favouriteColor + (day + month + year));

    }
}
