package days.first.Fifth;

import java.util.ArrayList;
import java.util.List;

public class HomeWork3 {
    public static void main(String[] args) {
        HomeWork3Person homeWork3Person = new HomeWork3Person("Sarunas", "Knyva", 31, "Kaunas");
        /*homeWork3Person.setName("Sarunas");
        homeWork3Person.setSurname("Knyva");
        homeWork3Person.setAge(31);
        homeWork3Person.setCity("Kaunas");*/

        //ARBA ALT + INSERT ir tada ToString(); kitame lange (HomeWork3Person)

        List<HomeWork3Person> persons = new ArrayList<>();
        persons.add(homeWork3Person);
        persons.add(new HomeWork3Person("Laura", "Kalinaite", 33, "Kaunas"));
        print(persons);

        System.out.println(persons);

        for (HomeWork3Person p : persons){
            System.out.println(p.getCity());
        }

    }
    private static void print(List<HomeWork3Person> persons) {
        for (HomeWork3Person p : persons) {
            System.out.println(p.getCity());


        }
    }
}
