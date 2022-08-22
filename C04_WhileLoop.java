package day18_OdevWhileLoops;

import java.util.Scanner;

public class C04_WhileLoop {
    public static void main(String[] args) {
        //kullanicidan baslangic ve bitis degerlerini alin
        //baslangic ve bitis degerleri dahil aralarindaki tum cift tamsayilari while loop
        //kullanarak ekrana yazdirin
        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen baslangic ve bitis deger girin");
        int bas = scanner.nextInt();
        int bit = scanner.nextInt();
        if (bas <= bit) {
            while (bas <= bit) {
                if (bas % 2 == 0) {
                    System.out.print(bas + " ");

                }
                bas++;
            }
        } else {
            while (bit <= bas) {
                if (bit % 2 == 0) {
                    System.out.print(bit + " ");

                }
                bit++;
            }
        }
    }
}
