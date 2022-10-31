
// Datum a čas
// Impoortované knihovny pro práci s datumem a časem

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class cv21 {
    public static void main(String[] args)  {
        // Aktivace Kalendáře
        Calendar kalendar = Calendar.getInstance();
        // Výpis aktualního datumu a času pomocí formátovaného výstupu
        DateFormat formatData = new SimpleDateFormat("d.MMMM yyyy H:mm");
        System.out.println(formatData.format(kalendar.getTime()));

        // Datum a čas
        System.out.println();
        Date dNow = new Date(); // dnešní datum
        System.out.println("Datum a čas: " + dNow);
        // Definice formátu pro zobrazení datumu a času
        // DateFormat dfFormat = new SimpleDateFormat("HH:mm:ss dd.MM.yyyy");
        // Formátovaný výpis datumu a času
        //System.out.println("Datum a čas: " +dfFormat(dNow));


    }
}