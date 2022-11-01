
// Cvičení 05 - Výpočet geometrických funkcí a přetypování proměnné

public class cv05 {
    public static void  main(String[] args) {
        // Zadání vstupních hodnot
        double uhel = 30;   //ůhel ve stupních

        // Výpočet Sin.
        // metoda Math.sin vyžaduje jako vstup úhel
        double v1 = Math.sin(Math.toRadians(uhel));
        float v11 = (float) Math.sin(Math.toRadians(uhel));
        double v111 = (float) Math.sin(Math.toRadians(uhel));
        /*
         * Výpočet úhlu dává odchylku při ukládání vypočtené
         * hodnoty jako double. Řešení je přetypování vypočtené 
         * hodnoty na typ float. 
         */
        // zobrazení výsledku sin
        System.out.println("Double : Sin("+uhel+")=" + v1);
        System.out.println("Float : Sin("+uhel+")=" + v11);
        System.out.println("Double(Float) : Sin("+uhel+")=" + v111);

        // Výpočet Cos, Tan.
        double v2 = (float) Math.cos(Math.toRadians(uhel));
        double v3 = (float) Math.tan(Math.toRadians(uhel));
        // zobrazení výsledků cos, tan
        System.out.println("cos("+uhel+")=" + v2);
        System.out.println("tan("+uhel+")=" + v3);





    }

    
}
