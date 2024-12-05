public class Main {
    public static void main(String[] args) {
        PieceBorder b1 = new PieceBorder(true, false);
        PieceBorder b2 = new PieceBorder(false, true);
        PieceBorder b3 = new PieceBorder(true, true);

        Piece piece1 = new Piece(b1, b2, b1, b2); 
        Piece piece2 = new Piece(b1, b1, b1, b1); 
        Piece piece3 = new Piece(b3, b1, b1, b2);
        Piece piece4 = new Piece(b1, b2, b3, b1); 
        Piece piece5 = new Piece(b1, b1, b1, b2); 
        Piece piece6 = new Piece(b3, b2, b1, b2);
        Piece piece7 = new Piece(b1, b2, b1, b3);
        Piece piece8 = new Piece(b2, b2, b3, b2);
        Piece piece9 = new Piece(b2, b3, b2, b2);

        Puzzle puzzle = new Puzzle();
        puzzle.placePiece(piece1, 0, 0);
        puzzle.placePiece(piece2, 2, 0);
        puzzle.placePiece(piece3, 0, 2); 
        puzzle.placePiece(piece4, 2, 2); 
        puzzle.placePiece(piece5, 1, 1); 
        puzzle.placePiece(piece6, 0, 1); 
        puzzle.placePiece(piece7, 1, 0); 
        puzzle.placePiece(piece8, 1, 2); 
        puzzle.placePiece(piece9, 2, 1); 

        puzzle.displayBoard();
    }
}