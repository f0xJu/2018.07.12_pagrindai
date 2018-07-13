package Namai;

import java.util.Scanner;

public class Uzduotis2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kiek skaiciu norite ivesti?");
        int size = sc.nextInt();
        test(size, sc);
    }

    private static void test(int size, Scanner sc) {
        for (int i = 0; i < size; i++) {
            System.out.println("Iveskite " + i + " elementa");
            int numb = sc.nextInt();
            if (numb >= 100) {
                System.out.println("Didesni nei simtas skaiciai buvo: "+ numb);
            }
        }
    }
}



