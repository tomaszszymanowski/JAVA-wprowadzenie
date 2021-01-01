package LoopWhile;

public class Task3 {
    public static void main(String[] args) {


        int count = 0;
        int starNumber = 4;
        String star = "";

        while (count < starNumber) {
            star += "*";
            System.out.println(star);
            count++;
        }

        starNumber = 6;
        count = 0;
        star = "";
        System.out.println();

        while (count < starNumber) {
            star += "*";
            System.out.println(star);
            count++;
        }

    }
}
