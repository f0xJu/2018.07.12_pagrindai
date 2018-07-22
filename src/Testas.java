import java.util.Scanner;

public class Testas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite du skaicius ir veiksma tarp ju, pvz '20 + 20'");

        int numb1;
        int numb2;
        int sum;
        int dif;
        numb1 = scanner.nextInt();
        numb2 = scanner.nextInt();
        sum = scanner.nextInt();
        dif = scanner.nextInt();




        String line = "";
        while (!line.equals("quit")) {


            line = scanner.nextLine();


            String[] items = line.split(" ");
            if (items.length == 3) {


                double result;
                switch (items[1]) {
                    case "+":
                        result = numb1 + numb2;
                        System.out.println("Suma " + result);
                        break;
                    case "-":
                        result = numb1 - numb2;
                        System.out.println("Skyrtumas " + result);
                        break;
                    default:
                        System.out.println("Nepavyko rasti");
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





