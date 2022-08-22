package day18_OdevWhileLoops;

import java.util.Scanner;

public class C09_WhileLoop {
    public static void main(String[] args) {
        //kullanicidan bir sayi alin ve bu sayilarin toplamini yazdirin.
        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir sayi girin");
        int sayi = scanner.nextInt();
        int birlerBas=0;
        int toplam=0;

         while(sayi>0){
             birlerBas=sayi%10;
             toplam+=birlerBas;
             sayi/=10;

         }
        System.out.println("rakamlar toplami = "+toplam);
    }
}
