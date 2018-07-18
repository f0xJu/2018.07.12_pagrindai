package Thourth;

import java.util.*;

public class SecondExample {
    public static void main(String[] args) {
        //Is konsole yrasyti 5 vardus i lista ir juos atspauzdinti surikiuotus

        Scanner scanner = new Scanner(System.in);
        List<String> names = new ArrayList<>();

        for (int i = 0; i < 5; i++){
            System.out.println("Iveskite " + i + " Varda");
            String name = scanner.nextLine();
            names.add(name);
        }

        Collections.sort(names);
        names.forEach(System.out::println);


    }





}
