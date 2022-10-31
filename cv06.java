// Cvičení 06 - Generování náhodného čísla, zaokrouhlení čísla

public class cv06 {
 public static void main(String[] args) {
        // zobrazení náhodného čísla v rozmezí od 0 do 1
        System.out.println("Náhodné číslo: " + Math.random());
        // zobrazení celého náhodného čísla v rozmezí od 1 do 10
        /* Vygenerované náhodné číslo vynásobíme číslem 10 a připčteme k němu
         * číslo 1, aby výsledek byl od 1 ne od 0. Aby vzniklo celé číslo, 
         * musíme provést přetypování na integer. */
        System.out.println("Náhodné číslo: " +((int) (Math.random()*10)+1) );


        // zaokrouhlení na celá čísla
        double cislo = 23.5996433;
        System.out.println("Zadané číslo: "+cislo);
        // parametr je desetinné číslo, zaokrouhluje se na celé číslo
        // (od 0.5 nahoru, jinak dolů)
        System.out.println("Zaokrouhleno round: "+Math.round(cislo)); // za 23...... zkus změnit hodnotu nad a pod 5
        // číslo je vždy zaokrouhleno nahoru
        System.out.println("Zaokrouhleno ceil: "+Math.ceil(cislo));
        // číslo je vždy zaokrouhleno dolu
        System.out.println("Zaokrouhleno floor: "+Math.floor(cislo));



    }
}