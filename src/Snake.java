import java.util.ArrayList;
import java.util.List;

public class Snake extends Entity {
    private int length = 1;
    private Direction direction;
    private List<Segment> body;
    private CollisionDetector collisionDetector = new CollisionDetector();

    public Snake() {
        this.body = new ArrayList<>();
        this.direction = Direction.RIGHT;
        body.add(position);
    }

    @Override
    public void move() {
        System.out.println("Snake is moving " + direction);
    }

    public void grow() {
        length++;
        System.out.println("Snake grows. New length: " + length);
    }

    public void changeDirection(Direction newDirection) {
        this.direction = newDirection;
        System.out.println("Snake direction changed to: " + direction);
    }
}
