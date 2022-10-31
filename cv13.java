/*
 * Cvičení 13 - Předčasné ukončení programu.
 */

import java.util.Scanner;

public class cv13 { 
    public static void main(String[] args) {
        // aktivace instance scanner
        Scanner scc = new Scanner (System.in); // čísla

        // zadání kladného čísla
        System.out.print("Zadej kladné číslo nebo nulu: ");
        int cislo = scc.nextInt();

        if (cislo<0) {         // kontrola vstupní hodnoty
           System.out.println("Zadané číslo je záporné. Zadal jsi: "+cislo);
           System.err.println("Program byl ukončen předčasně.");
           System.exit(0); // předčasné ukončení programu

        } 
        System.out.println("Zadal jsi kladné číslo nebo nulu. Zadané číslo: "+cislo);
    }
 
}
