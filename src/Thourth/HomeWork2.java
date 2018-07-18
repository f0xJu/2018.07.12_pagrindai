package Thourth;

import java.util.ArrayList;
import java.util.List;

public class HomeWork2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(5);
        numbers.add(10);
        numbers.add(69);
        numbers.add(17);
        numbers.add(18);

        HomeWork2 homeWork2 = new HomeWork2();
        System.out.println(homeWork2.getFirst(numbers));
        System.out.println(homeWork2.getLast(numbers));



        }

        private Integer getFirst (List<Integer> numbers) {
        return numbers.get(0);
        }
        private Integer getLast (List<Integer> numbers) {
        return numbers.get(numbers.size() - 1);
        }


    }

