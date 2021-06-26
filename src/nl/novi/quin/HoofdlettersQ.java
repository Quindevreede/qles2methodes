package nl.novi.quin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;


/* Hieronder maken we de klasse aan met
een ArrayList, daarna voegen we met .add
de namen toe aan de List heroAlias
 */
public class HoofdlettersQ {
    public static void main(String[] args) {
        List<String> heroAlias = new ArrayList<>();

        heroAlias.add("peter den parker");
        heroAlias.add("reed richards");
        heroAlias.add("wade de wilson");
        heroAlias.add("matt van murdock");
        heroAlias.add("bruce banner");
        heroAlias.add("stephen van strange");
        heroAlias.add("kal-el");

        /* Hieronder loopen we door de lijst heen en
        maken we een tijdelijke String variabele
        aan (tempName) die alle namen in de lijst bevat.
        Daarna gebruiken we de METHODE splitNames aan met
        de " " spatie als grens waar de String split.
        We loopen met deze METHODE door de loop heen en
        als het GEEN isTussenVoegsel(de,den,van) is (daarom staat !(GEEN))
        maakt de Methode voor de substring van het begin van het woord (0)
        tot na de eerste letter (1) een hoofdletter en plak daar
        de rest van de naam aan vast. (Dus bijv Bruce pakt ie eerste
        letter b maakt ie B en plakt daar "ruce" aan vast.
        met de String.join plakt ie de voornaam, het eventuele
        lidwoord ertussen en de achternaam weer met spaties in de
        String waar ze horen maar nu met hoofdletters.
         */
        for (int i = 0; i < heroAlias.size(); i++) {
            String tempName = heroAlias.get(i);

            String[] splitNames = tempName.split(" ");
            for (int j = 0; j < splitNames.length; j++) {
                if (!isTussenVoegsel(splitNames[j])) {
                    String newName = splitNames[j].substring(0, 1).toUpperCase() + splitNames[j].substring(1);
                    splitNames[j] = newName;
                }
            }

            tempName = String.join(" ", splitNames);
            heroAlias.set(i, tempName);
        }

        /* Hieronder gaan we weer Strings SPLITTEN om de hoofdletter
        erin te zetten, maar dit keer is het voor "kal-el"
        dus moeten we de String splitten bij "-"(het streepje)
        Verder is de code bijna identiek, maar splitNames heet hier
        splitStripe.
         */
        for (int i = 0; i < heroAlias.size(); i++) {
            String tempName = heroAlias.get(i);

            String[] splitStripe = tempName.split("-");
            for (int j = 0; j < splitStripe.length; j++) {
                if (!isTussenVoegsel(splitStripe[j])) {
                    String newName = splitStripe[j].substring(0, 1).toUpperCase() + splitStripe[j].substring(1);
                    splitStripe[j] = newName;
                }
            }

            tempName = String.join("-", splitStripe);
            heroAlias.set(i, tempName);
        }
        /* Met Collections.sort zetten we een Arraylist in
        alfabetische volgorde. De printListWithIndex roepen
        we aan om de METHODE printListWithIndex() onderaan
        uit te laten printen
         */
        Collections.sort(heroAlias);
        printListWithIndex(heroAlias);
    }

    /* Hieronder staat de boolean METHODE om de tussenvoegsel
       woorden in de namen (lidwoorden) GEEN HOOFDLETTER te
       geven, dus als we de aangegeven woorden in de loop door
       de lijst tegenkomen worden die bij METHODE isTussenVoegsel
       bijgevoegd en de methode voor hoofdletters maken checkt
       dus eerst of het GEEN isTussenVoegsel is met if(!isTussenVoegsel(splitNames(i))
     */
    public static boolean isTussenVoegsel(String lidWoord) {
        List<String> tussenvoegsels = Arrays.asList("van", "de", "den");
        for(String tussenvoegsel : tussenvoegsels) {
            if (lidWoord.equalsIgnoreCase(tussenvoegsel)) {
                return true;
            }
        }
        return false;
    }
    public static void printListWithIndex(List<String> heroAlias) {
        System.out.println("Heroes in list with position : ");
        for (int i = 0; i < heroAlias.size(); i++) {
            System.out.println(i + " : " + heroAlias.get(i));
        }
    }
}
