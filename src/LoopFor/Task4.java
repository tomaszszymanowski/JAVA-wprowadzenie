package LoopFor;

public class Task4 {
    public static void main(String[] args) {
        int number = 1;
        int[][] numbers = new int[10][10];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                numbers[i][j] = number;
                number++;
            }
        }

        for (int k = 0; k < numbers.length; k++) {

            for (int l = 0; l < numbers.length; l++) {
                System.out.print(numbers[k][l] + ", ");
                if (numbers[k][l] % 10 == 0) {
                    System.out.println();
                }
            }
        }

    }
}
