package second;

import Utils.NumberUtils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ThirdTask thirdTask = new ThirdTask();
        System.out.println("Pasirinkite figura\na-statusis trikampis\nb-staciakampis\nc-kvadratas\nd-apskritimas");

        String selection = scanner.nextLine();

        switch (selection) {
            case "a":
                System.out.println(thirdTask.trikampioPlotas(scanner));
                break;
            case "b":
                System.out.println((thirdTask.staciakampioPlotas(scanner)));
                break;
            case "c":
                System.out.println((thirdTask.kvadratoPlotas(scanner)));
                break;
            case "d":
                System.out.println((thirdTask.apskritimoPlotas(scanner)));
                break;
            default:
                System.out.println("Vesk is naujo!");
                break;
        }

    }

    private double trikampioPlotas (Scanner scanner){
        double a = NumberUtils.getCorrectNumber(scanner,"Iveskite statini a");
        double b = NumberUtils.getCorrectNumber(scanner,"Iveskite statini b");
        return (a*b)/2;
    }

    private double staciakampioPlotas (Scanner scanner){
        double a = NumberUtils.getCorrectNumber(scanner,"Iveskite statini a");
        double b = NumberUtils.getCorrectNumber(scanner,"Iveskite statini b");
        return (a * b);
    }

    private double kvadratoPlotas (Scanner scanner) {
        double a = NumberUtils.getCorrectNumber(scanner,"Iveskite statini");
        return (Math.pow(a, 2));
    }

    private double apskritimoPlotas (Scanner scanner) {
        double a = NumberUtils.getCorrectNumber(scanner,"Iveskite spinduli");
        return (Math.PI * (a * a));
    }



    }



