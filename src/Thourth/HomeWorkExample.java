package Thourth;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HomeWorkExample {
    public static void main(String[] args) {
        Set<Integer> number = new TreeSet<>();

        number.add(2);
        number.add(6);
        number.add(9);
        number.add(11);
        number.add(14);

        for (Integer numb : number){
            if (numb >= 5 && numb <= 10){
                System.out.println(numb);
            }
        }
    }
}
