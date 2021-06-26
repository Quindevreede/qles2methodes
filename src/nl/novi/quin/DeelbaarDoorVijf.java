package nl.novi.quin;

public class DeelbaarDoorVijf {
    public DeelbaarDoorVijf() {
    }
/* Hieronder wordt een MODULUS gebruikt.
deze checkt wat er overblijft als het getal
gedeeld wordt met een getal (in dit geval
dus 44 % 5 = 4, want na 8 x 5 hou je nog vier over.
 */
    public static void main(String[] sammieKijkOmhoog) {
        int chosenNumber = 44;
        if (chosenNumber % 5 == 0) {
            System.out.println("Deelbaar door vijf.");
        } else {
            System.out.println("Ondeelbaar door vijf.");
        }

    }
}
