package day12Loops;

public class Example2 {
    public static void main(String[] args) {
//            1
//            1 2
//            1 2 3
//            1 2 3 4
//            1 2 3 4 5   
        String a="";
for (int i = 1; i <6; i++) {
    a = a + i+" ";
    System.out.println(a);
}
//2.yol
        for (int i = 1; i <7; i++) {
            for (int j = 1; j <i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }


        
    }
}
