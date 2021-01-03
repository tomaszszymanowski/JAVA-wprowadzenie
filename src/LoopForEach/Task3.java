package LoopForEach;

public class Task3 {
    public static void main(String[] args) {

        int[][] numbers = {{2,4},{6,8}};

        for (int[] singleArray: numbers) {

            for (int elementOfArray: singleArray) {
                System.out.print(elementOfArray + ", ");
            }
            System.out.println("");
        }
    }
}
