package nl.novi.quin;

public class DeelbaarDoorX {
    public DeelbaarDoorX() {
    }

    public static void main(String[] args) {
        System.out.println(isDivisible(12, 3));
        System.out.println(isDivisible(15, 5));
        System.out.println(isDivisible(13, 3));
        System.out.println(isDivisible(14, 3));
        System.out.println(isDivisible(14, 4));
    }
/* Hierboven worden de getallen aangegeven dus de eerste
  is kun je 12 door 3 delen?
 */
    private static String isDivisible(int number, int divisible) {
        if (number % divisible == 0) {
            return number + " is deelbaar door " + divisible;
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Het getal ").append(number).append(" is niet deelbaar door: ").append(divisible).append(".\r\n");
            int restNumber = number % divisible;
            double deling = (double)restNumber / (double)divisible;
            if (deling < 0.5D) {
                stringBuilder.append("Verlaag het getal met ").append(restNumber);
            } else {
                stringBuilder.append("Verhoog het getal met ").append(divisible - restNumber);
            }

            return stringBuilder.toString();
        }
    }
}

