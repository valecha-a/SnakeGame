public class Food extends Entity {
    public void spawnFood() {
        System.out.println("Food spawned at random location.");
    }

    @Override
    public void move() {
        // Food doesn't move in this game context
    }
}

