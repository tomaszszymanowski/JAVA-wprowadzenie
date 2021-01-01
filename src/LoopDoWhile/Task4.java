package LoopDoWhile;

public class Task4 {
    public static void main(String[] args) {
        int[][] board = new int[8][8];
        int black = 1;
        int white = 4;

        // nieparzyste jako czarne
        board[0][0] = black;
        board[0][2] = black;
        board[0][3] = black;
        board[0][4] = black;
        board[0][5] = black;
        board[1][0] = black;
        board[1][4] = black;
        board[1][6] = black;
        board[2][0] = black;
        board[2][2] = black;
        board[2][5] = black;
        board[2][7] = black;
        board[3][1] = black;
        board[3][3] = black;

        board[7][3] = black;


        // parzyste jako białe
        board[2][4] = white;
        board[3][5] = white;
        board[3][7] = white;
        board[4][1] = white;
        board[4][3] = white;
        board[4][7] = white;
        board[5][0] = white;
        board[5][1] = white;
        board[5][2] = white;
        board[5][4] = white;
        board[6][2] = white;
        //board[6][3] = white;
        board[6][4] = white;
        board[6][7] = white;
        board[7][4] = white;
        board[7][5] = white;

//        for(int i = 0; i< board.length; i++){
//            for (int j = 0; j< board.length; j++){
//                System.out.print(board[i][j]);
//            }
//            System.out.println();
//        }

        int xPos = 6;
        int yPos = 4;
        int x = 0;
        int y = 0;
        int atackX1 = 0;
        int atackY1 = 0;

        //przeciwnik w pionie
        x = xPos;
        do {
            if (board[x][yPos] == 1) {
                System.out.println("jest bicie na pozycji " + x + ", " + yPos);
                break;
            }
            x--;
            if (board[x][yPos] == 4) {
                break;
            }
        } while (x > 0);

        x = xPos;
        do {
            if (board[x][yPos] == 1) {

                System.out.println("jest bicie na pozycji " + x + ", " + yPos);
                break;
            }
            x++;
        } while (x < board.length);

        // przeciwnik w poziomie
        y = yPos;
        do {
            if (board[xPos][y] == 1) {
                System.out.println("jest bicie na pozycji " + xPos + ", " + y);
                break;
            }
            y++;
        } while (y < board.length);

        y = yPos;
        do {
            if (board[xPos][y] == 1) {
                System.out.println("jest bicie na pozycji " + xPos + ", " + y);
                break;
            }
            y--;
        } while (y > 0);

        // przeciwnik do góry na skos
        y = yPos;
        x = xPos;

        do {
            if (board[x][y] == 1) {
                System.out.println(" jest bicie na pozycji " + x + ", " + y);
                break;
            }
            x--;
            y--;
        } while (x >= 0 && y >= 0);

        y = yPos;
        x = xPos;
        do {
            if (board[x][y] == 1) {
                System.out.println(" jest bicie na pozycji " + x + ", " + y);
                break;
            }
            x--;
            y++;
        } while (x >= 0 && y < board.length);

        // przeciwnik po skosie w dół
        y = yPos;
        x = xPos;
        do {
            if (board[x][y] == 1) {
                System.out.println(" jest bicie na pozycji " + x + ", " + y);
                break;
            }
            x++;
            y--;
        } while (x < board.length  && y >= 0);

        y = yPos;
        x = xPos;
        do {
            if (board[x][y] == 1) {
                System.out.println(" jest bicie na pozycji " + x + ", " + y);
                break;
            }
            x++;
            y++;
        } while (x < board.length  && y < board.length);




    }
}
