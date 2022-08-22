package day18_OdevWhileLoops;

public class C02_WhileLoop {
    public static void main(String[] args) {
        //While loop kullnarak 3 den 13 e kadar tum tek sayilari ekrana yazdirin

        //while loop kullnarak
        int bas=3;
        int bit=13;
        int temp=bas;
        while (temp<=bit) {
            if (temp%2==1)
                System.out.print(temp+" ");
            temp++;
        } //do while loop kullnarak
        System.out.println("");
        do {
            if (bas%2==1){
                System.out.print(bas+" ");
            }bas++;
        }while (bas<=bit);
    }
}
