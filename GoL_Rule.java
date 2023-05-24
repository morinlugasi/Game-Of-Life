package taskB;


import java.util.Random;

/**
 * @author This class implements the CA rule for a standard 'Game of Life' simulation
 */
public class GoL_Rule {//implements CA_Rule {
    private int[][] board;

    // TODO add code as appropriate.
    public GoL_Rule(int row, int col) {
        board = new int[row][col];
        fillBoard();
    }

    private void fillBoard() {
        Random r = new Random();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                this.board[i][j] = r.nextInt(2);
            }
        }
        printBoard();
    }

    private void printBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] +" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void ImplementRule() {
        int[][] temp_board = new int[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                int neighbor = checkStatusOfCell(board, i, j);
                if (board[i][j] == 1) {
                    if (neighbor < 2 || neighbor > 3) {
                        temp_board[i][j] = 0;
                    }
                } else if (neighbor == 3)
                    temp_board[i][j] = 1;
            }
        }
        board = temp_board;
        printBoard();
    }

    private int checkStatusOfCell(int[][] board, int i, int j) {
        int alive = 0;
        //top left
        if (i == 0 && j == 0) {
            if (board[i][j + 1] == 1)
                alive++;
            if (board[i + 1][j + 1] == 1)
                alive++;
            if (board[i + 1][j] == 1)
                alive++;
            //top right
        } else if (i == 0 && j == board[i].length - 1) {
            if (board[i][j - 1] == 1)
                alive++;
            if (board[i + 1][j - 1] == 1)
                alive++;
            if (board[i + 1][j] == 1)
                alive++;
            //top
        } else if (i == 0) {
            if (board[i][j + 1] == 1)
                alive++;
            if (board[i][j - 1] == 1)
                alive++;
            if (board[i + 1][j] == 1)
                alive++;
            if (board[i + 1][j + 1] == 1)
                alive++;
            if (board[i + 1][j - 1] == 1)
                alive++;
            //down right
        } else if (i == board.length - 1 && j == board[i].length - 1) {
            if (board[i][j - 1] == 1)
                alive++;
            if (board[i - 1][j - 1] == 1)
                alive++;
            if (board[i - 1][j] == 1)
                alive++;
            //down
        } else if (i == board.length - 1 && j > 0) {
            if (board[i - 1][j] == 1)
                alive++;
            if (board[i][j - 1] == 1)
                alive++;
            if (board[i][j + 1] == 1)
                alive++;
            if (board[i - 1][j + 1] == 1)
                alive++;
            if (board[i - 1][j - 1] == 1)
                alive++;
            //down left
        } else if (j == 0 && i == board.length - 1) {
            if (board[i - 1][j] == 1)
                alive++;
            if (board[i - 1][j + 1] == 1)
                alive++;
            if (board[i][+1] == 1)
                alive++;
            //left
        } else if (j == 0) {
            if (board[i][j + 1] == 1)
                alive++;
            if (board[i - 1][j] == 1)
                alive++;
            if (board[i + 1][j] == 1)
                alive++;
            if (board[i + 1][j + 1] == 1)
                alive++;
            if (board[i - 1][j + 1] == 1)
                alive++;
            //right
        } else if (j == board[i].length - 1) {
            if (board[i][j - 1] == 1)
                alive++;
            if (board[i - 1][j] == 1)
                alive++;
            if (board[i + 1][j] == 1)
                alive++;
            if (board[i + 1][j - 1] == 1)
                alive++;
            if (board[i - 1][j - 1] == 1)
                alive++;
            // middle
        } else {
            if (board[i - 1][j - 1] == 1)
                alive++;
            if (board[i - 1][j] == 1)
                alive++;
            if (board[i - 1][j + 1] == 1)
                alive++;
            if (board[i][j - 1] == 1)
                alive++;
            if (board[i][j + 1] == 1)
                alive++;
            if (board[i + 1][j - 1] == 1)
                alive++;
            if (board[i + 1][j] == 1)
                alive++;
            if (board[i + 1][j + 1] == 1)
                alive++;
        }
        return alive;
    }
}
