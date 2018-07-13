package second;

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
        System.out.println("Iveskite a statini");
        double a = scanner.nextDouble();
        System.out.println("Iveskite b statini");
        double b = scanner.nextDouble();
        return (a*b)/2;
    }

    private double staciakampioPlotas (Scanner scanner){
        System.out.println("Iveskite a statini");
        double a = scanner.nextDouble();
        System.out.println("Iveskite b statini");
        double b = scanner.nextDouble();
        return (a * b);
    }

    private double kvadratoPlotas (Scanner scanner) {
        System.out.println("Iveskite a statini");
        double a = scanner.nextDouble();
        return (Math.pow(a, 2));
    }

    private double apskritimoPlotas (Scanner scanner) {
        System.out.println("Iveskiti a statini");
        double a = scanner.nextDouble();
        return (Math.PI * (a * a));
    }

}

