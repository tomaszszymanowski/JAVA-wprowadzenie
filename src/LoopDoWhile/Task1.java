package LoopDoWhile;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {15,72, 6, -51, 24};

        int i = 0;

        do {
            System.out.print(numbers[i]+", ");
        }while ( i < numbers.length-1 && numbers[i++] > 0);





    }
}
