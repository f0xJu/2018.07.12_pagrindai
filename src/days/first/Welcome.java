package days.first;

public class Welcome {
    //pvsm sukuria main metoda
    // ctrl+alt+l surikiuoja
    public static void main(String[] args) {
        int a = 10;

        System.out.println(a);

        //kaip iskviesti statini metoda?
        minus(12 ,6);
        System.out.println(minus(12 , 6));

        //int b = minus(12, 6);
        //System.out.println(b);

        //kaip iskviesti ne statini metoda?
        Welcome welcome = new Welcome(); //sukuriamas objektas
        welcome.printName("Sarunas");

    }

    private void printName(String name){
        System.out.println(name);

    }

    private static int minus(int numb, int numb2){

        return numb - numb2;
    }




}
