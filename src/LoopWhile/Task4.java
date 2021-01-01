package LoopWhile;

public class Task4 {
    public static void main(String[] args) {
        int len = 5;
        int i = len;
        int j;
        int k =0;


        while (i > 0) {
            j=i;
            k = 2 * (len - i) + 1;
            while (j > 0) {
                System.out.print(" ");
                j--;
            }
            while (k > 0) {
                System.out.print("*");
                k--;
            }

            System.out.println();
            i--;
            
        }


    }
}

