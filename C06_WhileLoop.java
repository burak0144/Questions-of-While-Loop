package day18_OdevWhileLoops;

import java.util.Scanner;

public class C06_WhileLoop {
    public static void main(String[] args) {
        /*
        kullanicidan baslangic ve bitis harflerini alin ve baslangic harfinden baslayip
         bitis harfinde bten tum harfleri buyuk harf olarak ekrana yazdirin.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen baslangic ve bitis harflerini girin");
        char bas = scanner.next().charAt(0);
        char bit = scanner.next().charAt(0);
        String buyult="";
        if (bas <= bit) {
            while (bas <= bit) {
                buyult=(bas+"").toUpperCase();
                    System.out.print(buyult + " ");
                bas++;
                }

            }else {
            while (bit <= bas) {
                buyult=(bit+"").toUpperCase();
                System.out.print(buyult + " ");
                bit++;
            }
        }
        }

    }

