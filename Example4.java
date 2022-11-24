package day12Loops;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        //verilen tamsayinin rakamlari toplamini yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayi girin");
        int sayi= scan.nextInt();
        int toplam=0;

        while(sayi>0){
toplam=toplam+sayi%10;
sayi=sayi/10;

}
        System.out.println(toplam);

        }


    }

