public class PieceBorder {
    private boolean topPart;
    private boolean botPart;

    public PieceBorder(boolean topPart, boolean botPart) {
        this.topPart = topPart;
        this.botPart = botPart;
    }

    public boolean doesFit(PieceBorder other) {
        return this.topPart != other.topPart && this.botPart != other.botPart;
    }

    @Override
    public String toString() {
        return "(" + topPart + ", " + botPart + ")";
    }
}
