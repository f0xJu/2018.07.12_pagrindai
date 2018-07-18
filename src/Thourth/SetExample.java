package Thourth;

import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        Set<String> names = new TreeSet<>();

        names.add("Jonas");
        names.add("Petras");
        names.add("Sarunas");
        names.add("Aiste");
        names.add("Laura");
        names.add("Jonas");
        names.add("Sarunas");

        System.out.println(names.size());
        // nuo java 8, names yra musu setas
        names.forEach(System.out::println);

    }

}

