package days.first.Fifth;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ThirdExample {

    private static final String FILE_NAME = "src/names.txt";

    public static void main(String[] args) {

        Set<String> names = new TreeSet<>();

        try (BufferedReader bf = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = bf.readLine()) != null){
                //System.out.println(line);
                //TODO line
                names.add(line);
            }

        }catch (IOException e){
                System.out.println("Nu nenuskaitem " + e);
            }


            for (String name : names){
                 if (name.length() >= 6){
                System.out.println(name);
            }

        }





    }
}
