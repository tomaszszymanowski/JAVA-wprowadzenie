package LoopDoWhile;

public class Task3 {
    public static void main(String[] args) {
        int[][] board = new int[8][8];
        int black = 1;
        int white = 4;

        // nieparzysteliczby jako czarne
        board[0][4] = black;
        board[1][0] = black;
        board[1][1] = black;
        board[1][2] = black;
        board[1][3] = black;
        board[1][7] = black;
        board[2][2] = black;
        board[2][2] = black;
        board[2][6] = black;
        board[3][0] = black;
        board[4][5] = black;
        board[7][2] = black;


        //parzyste jako białe
        board[4][3] = white;
        board[4][6] = white;
        board[5][2] = white;
        board[5][5] = white;
        board[6][0] = white;
        board[6][1] = white;
        board[6][5] = white;
        board[6][6] = white;
        board[6][7] = white;
        board[7][0] = white;
        board[7][4] = white;
        board[7][7] = white;

        for(int i = 0; i< board.length; i++){
            for (int j = 0; j< board.length; j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }

        int x = 0, y = 0;
        int xPos = 7;
        int yPos = 4;
        int atackX1 = 0;
        int atackX2 = xPos;
        int atackY1;
        int atackY2 = 0;


        while (x < xPos) {
            if (board[x][yPos] == 1) {
                atackX1 = x;
                if (atackX1 < x) {
                    atackX1 = x;
                }
            }
            x++;
        }
        System.out.println("pionek do zbicia w pionie na pozycji " + atackX1 + " " + yPos);

        // zbicia w pionie
        x = xPos;
        while (x < board.length) {
            if (board[x][yPos] == 1) {
                atackX2 = x;
            }
            x++;
        }
        if (atackX2 > 0 && atackX2 > xPos) {
            System.out.println("pionek do zbicia w pionie na pozycji " + atackX2 + " " + yPos);
        }

        // zbicia w poziomie
        while (y < yPos) {
            if (board[xPos][y] == 1) {
                atackY1 = y;
                if (atackY1 < y) {
                    atackY1 = y;
                }
                System.out.println("pionek do zbicia w poziomie na pozycji " + xPos + " " + atackY1);
            }
            y++;
        }

        y = yPos+1;
        while (y > yPos && y < board.length){
            if(board[xPos][y] == 1 ){
                atackY2 = y;
                if(atackY2 < y){
                    atackY2 = y;
                }
                System.out.println("pionek do zbicia w poziomie na pozycji " + xPos + " " + atackY2);
            }
            y++;
        }

    }
}
