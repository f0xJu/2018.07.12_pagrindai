package Third;

import Utils.NumberUtils;

import java.util.Scanner;

public class SixthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();


        String line = "";
        while (!line.equals("quit")) {
            System.out.println("Iveskite du skaicius ir veiksma tarp ju, pvz '20 + 20'");

            line = scanner.nextLine();

            String[] items = line.split(" ");
            if (items.length == 3) {

                double numb = getNumber(scanner, items[0], "Pakartokite pirma skaiciu");
                double numb2 = getNumber(scanner, items[2], "Pakartokite antra skaiciu");


                double result;
                switch (items[1]) {
                    case "+":
                        result = calculator.sum(numb, numb2);
                        System.out.println("Suma " + result);
                        break;
                    case "-":
                        result = calculator.dif(numb, numb2);
                        System.out.println("Skyrtumas " + result);
                        break;
                    case "/":
                        result = calculator.div(numb, numb2);
                        System.out.println("Dalmuo " + result);

                    case "*":
                        result = calculator.daug(numb, numb2);
                        System.out.println("Sandauga " + result);
                        break;
                    case "^":
                        result = calculator.kvad(numb);
                        System.out.println("Skaiciai pakelti kvadratu" + result);
                        break;
                    default:
                        System.out.println("Nepavyko rasti");
                        break;
                }
            } else if (!line.equals("q")){
                System.out.println("Blogas formatas");
            }
        }
    }

    private static double getNumber(Scanner scanner, String numb, String message) {
        double result;
        try {
            result = Double.parseDouble(numb);
        }catch (NumberFormatException e) {
            result = NumberUtils.getCorrectNumber(scanner, message);
        }
        return result;
    }
}
