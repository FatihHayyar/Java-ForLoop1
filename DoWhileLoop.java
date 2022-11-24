package day12Loops;

public class DoWhileLoop {
    public static void main(String[] args) {
        int i=1;
        while(i>1) {
            System.out.println(i);
            i++;
        }
//while de zero cozum mevcut, do while loop en az bir islem yapar.
        int k=1;
        do{
            System.out.println(k);
            k++;}
        while(k<1);
    }
}
