package nl.novi.quin;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class HoogsteGetalAbstractQ {
    public HoogsteGetalAbstractQ() {
    }

    public static void main(String[] args) {
        highestNumber(Arrays.asList(555, 666, 777, 888, 6666));
    }

    public static List<Integer> highestNumber(List<Integer> numbers) {
        int hoogsteGetal = 0;
        Iterator var2 = numbers.iterator();

        while(var2.hasNext()) {
            int number = (Integer)var2.next();
            if (number > hoogsteGetal) {
                hoogsteGetal = number;
            }
        }

        System.out.println("Het hoogste getal van de gegeven getallen is: " + hoogsteGetal);
        return numbers;
    }
}
