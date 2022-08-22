package day18_OdevWhileLoops;

import java.util.Scanner;

public class C07_WhileLoop {
    public static void main(String[] args) {
         /*
         kullanicidan bir rakam alin ve bu rakam icin carpim tablosunu ekrana yazdirin

          */
        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir rakam girin");
        int rakam = scanner.nextInt();
        boolean dogruMu=false;

        while (!(dogruMu==true)){
        for (int i = rakam; i <=rakam ; i++) {
            for (int j = 1; j <=10 ; j++) {
                System.out.print(i+"*"+j+"="+i*j+" ");

            }


        }dogruMu=true;



        }
    }
}
