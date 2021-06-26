package nl.novi.quin;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class HoogsteGetalAbstract {
    public HoogsteGetalAbstract() {
    }

    public static void main(String[] args) {
        highestNumber(Arrays.asList(1, 2, 3, 4, 5, 6, 22, 333, 555, 7777));
    }

    public static String highestNumber(List<Integer> numbers) {
        int hoogsteGetal = 0;
        Iterator var2 = numbers.iterator();

        while(var2.hasNext()) {
            int number = (Integer)var2.next();
            if (number > hoogsteGetal) {
                hoogsteGetal = number;
            }
        }

        return "Het hoogste getal van de gegeven getallen is: " + hoogsteGetal;
    }
}

