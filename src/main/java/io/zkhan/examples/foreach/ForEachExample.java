package io.zkhan.examples.foreach;

import java.util.ArrayList;
import java.util.List;

public class ForEachExample {

    public static void main(final String... args) {
        List<Integer> integerList = new ArrayList<>();

        for (int index = 0; index < 10; index++) {
            integerList.add(index);
            //Dev phase-2 changes
            System.out.print("Dev phase-2 changes");
            System.out.print("Prod fix");
        }

        integerList.forEach(System.out::print);
    }
}
