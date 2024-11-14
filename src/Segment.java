public class Segment {
    private int x;
    private int y;

    public Segment(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Segment getPosition() {
        return this;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Segment) {
            Segment other = (Segment) obj;
            return this.x == other.x && this.y == other.y;
        }
        return false;
    }
}
