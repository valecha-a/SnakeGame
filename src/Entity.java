public abstract class Entity {
    protected Segment position;

    public Entity() {
        this.position = new Segment(0, 0);
    }

    public abstract void move();

    public Segment getPosition() {
        return position;
    }
}
