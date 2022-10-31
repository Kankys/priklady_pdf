/*
 * Výpočet ověsny troujúhelníka pomocí Pythagorovy věty
 */


 public class cv04 {
    public static void main(String[] args) {
        // Zadání vstupních hodnot - přepony trouhelníka
        double a = 20;
        double b = 30;
        //Výpočet
        double v1 = Math.pow(a, 2);  // druhá mocnina přepony a
        double v2 = Math.pow(b, 2);  // druhá mocnina přepony b
        double c1 = v1 + v2;
        double c = Math.sqrt(c1);      // výpočet druhé odmocniny

        // Zobrazení výsledků
        System.out.println("Přepona A : " + a);
        System.out.println("Přepona B :" + b);
        System.out.println("Odvěsna : " + c);
    }
 }