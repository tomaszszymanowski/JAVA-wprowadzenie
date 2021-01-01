package LoopWhile;

public class Task5 {
    public static void main(String[] args) {
        int[][] sudoku = {{1, 0, 3}, {0, 1, 2}, {2, 3, 0}};

        int rowIndex = 0;


        while (rowIndex < sudoku.length) {
            int colIndex = 0;
            while (colIndex < sudoku[rowIndex].length) {
                if (sudoku[rowIndex][colIndex] == 0) {                  // jeśli występuje 0 jako pusta wartość tablicy
                    if (colIndex > 0  ) {    // jeśli 0 nie jest na początku indeksu lub jest ostatnim indekem
                        sudoku[rowIndex][colIndex] = sudoku[rowIndex][colIndex - 1] + 1;
                    } if(colIndex == sudoku.length-1){
                        sudoku[rowIndex][colIndex] = sudoku[rowIndex][colIndex - 1] - 2;
                    }
                    if (colIndex == 0) {                         // jeśli 0 występuje na początku indeksu
                        sudoku[rowIndex][colIndex] = sudoku[rowIndex][colIndex + 1] + 2;
                    }
                }
                System.out.print(sudoku[rowIndex][colIndex]);
                colIndex++;
            }
            System.out.println();
            rowIndex++;
        }
    }
}
