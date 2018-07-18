package Thourth;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class HomeWork1 {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Jonas");
        names.add("Petras");
        names.add("Sarunas");
        names.add("Justinas");
        names.add("Martynas");

        for (String name : names) {

            if (name.length() > 6) {
                System.out.println(name);
            }

        }
    }
}