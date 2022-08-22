package day18_OdevWhileLoops;

public class C03_WhileLoop {
    public static void main(String[] args) {
        //For loop ve while loop kullanarak 3 basamakli sayilardan 15,20 ve 90'a tam bolunebilen
    //sayilari yazdirin

        //For loop
        for (int i = 100; i <1000 ; i++) {
            if (i%15==0&&i%20==0&&i%90==0){
                System.out.print(i+" ");
            }


        }
        System.out.println("");
        int bas=100;
        int bit=999;

        while (bas<=bit){
            if (bas%15==0&&bas%20==0&&bas%90==0){
                System.out.print(bas+" ");


        }bas++;

    }
}}