package Thourth;

import java.util.Map;
import java.util.TreeMap;

public class MapExample {

    public static void main(String[] args) {
        Map<Integer, String> names = new TreeMap<>();
        names.put(2, "Jonas");
        names.put(3, "Petras");
        names.put(1, "Sarunas");
        names.put(5, "Justinas");
        names.put(5, "Arturas");

        System.out.println(names.size());

        for (Integer key : names.keySet()){
            System.out.println("key " + key + " " + names.get(key));
        }

        System.out.println(names.get(3));

        ConstrucorExample construcorExample = new ConstrucorExample();
    }
}
