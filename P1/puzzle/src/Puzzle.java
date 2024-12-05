public class Puzzle {
    private Piece[][] board;

    public Puzzle() {
        this.board = new Piece[3][3];
    }

    public boolean placePiece(Piece piece, int row, int col) {
        if (board[row][col] != null) {
            return false;
        }

        if (row > 0 && board[row - 1][col] != null) {
            if (!piece.fitsWith(board[row - 1][col], "top")) {
                System.out.println("A peça na posição (" + row + "," + col + ") não encaixa por cima.");
                return false;
            }
        }
        if (row < 2 && board[row + 1][col] != null) {
            if (!piece.fitsWith(board[row + 1][col], "bot")) {
                System.out.println("A peça na posição (" + row + "," + col + ") não encaixa por baixo.");
                return false;
            }
        }
        if (col > 0 && board[row][col - 1] != null) {
            if (!piece.fitsWith(board[row][col - 1], "left")) {
                System.out.println("A peça na posição (" + row + "," + col + ") não encaixa pela esquerda.");
                return false;
            }
        }
        if (col < 2 && board[row][col + 1] != null) {
            if (!piece.fitsWith(board[row][col + 1], "right")) {
                System.out.println("A peça na posição (" + row + "," + col + ") não encaixa pela direita.");
                return false;
            }
        }

        board[row][col] = piece;
        return true;
    }

    public void displayBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == null) {
                    System.out.print("[   ] ");
                } else {
                    System.out.print("[" + i + "," + j + "] ");
                }
            }
            System.out.println();
        }
    }
}
