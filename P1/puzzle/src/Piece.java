public class Piece {
    private PieceBorder top;
    private PieceBorder bot;
    private PieceBorder right;
    private PieceBorder left;

    public Piece(PieceBorder top, PieceBorder bot, PieceBorder right, PieceBorder left) {
        this.top = top;
        this.bot = bot;
        this.right = right;
        this.left = left;
    }

    public PieceBorder getTop() {
        return top;
    }

    public PieceBorder getBot() {
        return bot;
    }

    public PieceBorder getRight() {
        return right;
    }

    public PieceBorder getLeft() {
        return left;
    }

    public boolean fitsWith(Piece other, String side) {
        switch (side) {
            case "top":
                return this.top.doesFit(other.getBot());
            case "bot":
                return this.bot.doesFit(other.getTop());
            case "right":
                return this.right.doesFit(other.getLeft());
            case "left":
                return this.left.doesFit(other.getRight());
            default:
                throw new IllegalArgumentException("Lado inválido: " + side);
        }
    }

    @Override
    public String toString() {
        return "N:" + top + " S:" + bot + " E:" + right + " W:" + left;
    }
}
