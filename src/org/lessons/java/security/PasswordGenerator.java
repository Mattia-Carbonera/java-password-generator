package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {

        // * DICHIARO LE VARIABILI
        String name;
        String surname;
        String favouriteColor;
        int day;
        int month;
        int year;

        // * RECUPERO I DATI
        Scanner inputUser = new Scanner(System.in);

        System.out.println("Inserire nome");
        name = inputUser.nextLine();

        System.out.println("Inserire cognome");
        surname = inputUser.nextLine();

        System.out.println("Inserire il colore preferito");
        favouriteColor = inputUser.nextLine();

        System.out.println("Inserire giorno di nascita");
        day = inputUser.nextInt();

        System.out.println("Inserire mese di nascita");
        month = inputUser.nextInt();

        System.out.println("Inserire anno di nascita");
        year = inputUser.nextInt();


        // * STAMPO LA PASSWORD
        System.out.println("Password: " + name + "-" + surname + "-" + favouriteColor + "-" + (day + month + year));

    }
}
