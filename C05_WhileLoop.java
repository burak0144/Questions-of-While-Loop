package day18_OdevWhileLoops;

public class C05_WhileLoop {
    public static void main(String[] args) {


        int i;
        int j;
        int k;
        for (i=1; i<10; i++) {//satiri olusturmak icin
            for(j=i; j<10;j++) {//sutunu olustumak icin
                System.out.print(" ");//bu satır olmazsa dik ucgen yapar..
            }
            for (k=1; k<=i; k++) {
                System.out.print("* ");//istenen karakter

            }
            System.out.println(" ");//alt satıra geçmesi için
        }

    }
}
