package day18_OdevWhileLoops;

import java.util.Scanner;

public class C08_WhileLoop {
    public static void main(String[] args) {
        //kullanicidan bir sayi alin ve bu sayiyi tam bolen sayilari ve toplam kac tane olduklarini ekrana yazdirin
        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir sayi girin");
        int sayi = scanner.nextInt();
        int bas = 1;
        int bit = sayi;
        int toplamAdet = 0;
        while (bas <= bit) {
            if (bit % bas == 0) {
                System.out.print(bas + " ");
                toplamAdet++;

            }
            bas++;
        }     System.out.println(" ");
        System.out.println(toplamAdet +" tane boleni vardir");

    }
}