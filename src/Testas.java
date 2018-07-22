import java.util.Scanner;

public class Testas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite du skaicius ir veiksma tarp ju, pvz '2 + 2'");

        int numb1;
        int numb2;

        numb1 = scanner.nextInt();
        numb2 = scanner.nextInt();


        String line = "";
        while (!line.equals("quit")) {
            line = scanner.nextLine();

            String[] items = line.split(" ");
            if (items.length == 3) {



                switch (items[1]) {
                    case "+":

                        System.out.println("Suma " + sum(numb1, numb2));
                        break;
                    case "-":

                        System.out.println("Skyrtumas " + dif(numb1, numb2));
                        break;

                    default:
                        System.out.println("PFFFFFFFFFFFFFFFF");
                        break;
                }
            }
        }
    }
    public static int sum (int numb1, int numb2){
        int sum = numb1 + numb2;
        return sum;

    }
    public static int dif(int numb1, int numb2){
        int dif = numb1 - numb2;
        return  dif;
    }


}





