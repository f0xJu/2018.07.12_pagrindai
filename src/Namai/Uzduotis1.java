package Namai;

import java.util.Scanner;

public class Uzduotis1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite skaiciu");
        int numb = scanner.nextInt();

        if (numb % 2 == 0){
            System.out.println("Jusu ivestas skaicius yra "+numb+" ir jis yra lyginis");
        }else{
            System.out.println("Jusu ivestas skaicius yra "+numb+" ir jis yra nelyginis");        }
    }
}

