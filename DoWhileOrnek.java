package day12Loops;

public class DoWhileOrnek {
    public static void main(String[] args) {
        //ondalik sayinin ondalik kismindaki sayilarin toplamini bulun

        double num = 24.5673;
        //String.valueOf() methodu parantezin içine konulan datanın tipini String yapar.
        String str = String.valueOf(num);
        //Regex için nokta kullandığınızda önüne "\\" koyunuz. Yani nokta "\\." şeklinde kullanılır.
        String decimalPart = str.split("\\.")[1];
        int decimalInt = Integer.valueOf(decimalPart);
        int sum = 0;
        do {
            sum = sum + decimalInt%10;
            decimalInt =decimalInt/10;
        }while (decimalInt>0);
        System.out.println(sum);
    }
}


