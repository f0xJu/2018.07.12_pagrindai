package days.first.Fifth;

import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Iveskite savaites diena");

        int numb = scanner.nextInt();

        Week week = Week.getDayById(numb);

        System.out.println(week.name());
    }

}
