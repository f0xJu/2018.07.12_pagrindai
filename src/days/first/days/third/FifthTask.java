package days.first.days.third;

import Utils.NumberUtils;

import java.util.Scanner;

public class FifthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double atstumas = NumberUtils.getCorrectNumber(scanner, "Irasykite nuvaziuota atstuma");
        double kuras = NumberUtils.getCorrectNumber(scanner, "Irasykite sunaudoto kuro kieki");

        double result = (kuras * 100) / atstumas;

        System.out.println("Jusu kuro sanaudos vienam KM yra : "+ result);

    }

    private static double sanaudos(double atstumas, double kuras) {
        return(kuras * 100) / atstumas;

    }
}