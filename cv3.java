/* Cvičení 03 - Výpočet obvodu a obsahu kružnice. Bez zadání hodnoty v konzoli.

 */
public class cv3 {
    public static void main(String[] args) {
        // Zadání vstupních hodnot
        int polomer = 15; //poloměr kružnice
        // Výpočet
        double obvod = 2 * Math.PI * polomer; // Math.Pi... vrátí 3.14149...
        //Math.pow(x,y) y-tá mocnina čísla x
        double obsah = Math.PI * Math.pow(polomer, 2);
        // Zobrazení výsledků
        System.out.println("Obvod : " + obvod);
        System.out.println("Obsah : " + obsah);
        // Zobrazení výsledků  - zaokrouhleno na 2 desetinná místa
        System.out.printf("Obvod : %.2f" , obvod);
        System.out.println(); // nový řádek
        System.out.printf("Obsah . %.2f" , obsah );
        System.out.println(); //nový řádek



    }

}