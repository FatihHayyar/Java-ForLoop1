package day12Loops;

import java.util.Scanner;

public class NestedForLoop01 {
    public static void main(String[] args) {
        //Asagidaki sekli ekrana yazdiran kodu yaziniz... yildiz seklininin sayisini kullanicidan alalim
        Scanner scan=new Scanner(System.in);
        System.out.println("sutun sayisini girin");
        int a= scan.nextInt();
        System.out.println("satir sayisini girin");
        int b= scan.nextInt();
        System.out.println("bir karakter girin");
        char c= scan.next().charAt(0);
        for(int j=0;j<a;j++){
        for (int i = 0; i <b; i++) {

            System.out.print(c);
        }System.out.println();
        }





    }
}
