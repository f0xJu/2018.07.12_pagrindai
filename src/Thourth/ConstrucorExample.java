package Thourth;

public class ConstrucorExample {

    public ConstrucorExample (){
       this(4);
    }

    public ConstrucorExample (int a){
        System.out.println(a);
        printData();
    }

    private void printData(){
        System.out.println("Sveiki");
    }
}
