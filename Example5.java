package day12Loops;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        //Kullanicidan alinan sayinin carpim tablosunu yap
        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayi girin");
        int b=scan.nextInt();
        int a=1;
        int carpim=1;
        while (a<11){
            carpim=b*a;
            System.out.println(b+"*"+a+"="+carpim);
            a++;
        }






    }
}
