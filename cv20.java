
import java.util.Scanner;

/* Cvičení 20 - Cyklus Do While ..... cyklus řízení podmínkou.
 * Kontrola zadaného textu.
 */
public class cv20 {
    public static void main(String[] args) {
        // aktivace instance scanner
        Scanner sc = new Scanner(System.in, "UTF-8"); //texty

        /* Cyklus Do Whilw se opakuje dokud je podmínka splněna.
           Pokud při spuštění cyklu podmínka není splněna,
           cyklus proběhne minimálně jednou
        */

        // Cyklus Do While - kontrola minimální délky zapsaného textu
        String text;
        boolean err = false;   // Při prvním průchodu cyklem se nesmí zobrazit chybné hlášení
         int citac = 0; // čítač pro kontrolu počtu špatně zadaných vstupů
         do{
            citac ++;
            if (citac>5) { // ukončení cyklu při pěti chybných zadáních
                System.out.println("Po páté jsi nezadal šest znaků.");
                System.out.println("Program je dočasně ukončen");
                System.exit(0); // ukončí předčasně program


            }

            if (err) System.out.println("Chybně zadaný počet znaků. Opakuj zadání.");
            System.out.print("Zadej text minimálně 6 znaků: ");
            text = sc.nextLine();
            err = true;

         } while (text.length()<6);

         System.out.println("Zadaný text:"+text);
    }

    
}
