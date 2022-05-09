package se.lexicon.CollectionGeneric;

import java.util.HashSet;
import java.util.Iterator;

public class CollectionHashset {
    public static void main(String[] args) {
        hashsetEx5();
    }

    public static void hashsetEx5() {
        HashSet<String> weekdays = new HashSet<>();
        weekdays.add("Monday");
        weekdays.add("tuesday");
        weekdays.add("wednesday");
        weekdays.add("thursday");
        weekdays.add("Friday");
        weekdays.add("Saturday");
        weekdays.add("Sunday");
        System.out.println("weekdays" + weekdays);

        Iterator<String> itr = weekdays.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
