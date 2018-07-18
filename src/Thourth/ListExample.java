package Thourth;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        List<String> names = new LinkedList<>();

        names.add("Petras");
        names.add("Jonas");
        names.add("Sarunas");
        names.add("Kestutis");

        System.out.println(names);

        for (int i = 0; i <names.size(); i++){
            System.out.println(names.get(i));
        }
         // NUO 7 JAV'OS
        for(String name : names){
            System.out.println(name);
        }

        //NUO 8 JAV'OS

        names.forEach(System.out::println);

        System.out.println(names.size());
        System.out.println(names.isEmpty());
        System.out.println(names.contains("Jonas"));

    }
}
