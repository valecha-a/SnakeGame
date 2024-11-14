public class CollisionDetector {
    public boolean checkCollision(Entity entity) {
        System.out.println("Checking collision for entity at position: " + entity.getPosition());
        return false;
    }

    public boolean checkFoodCollision(Snake snake, Food food) {
        System.out.println("Checking if snake collided with food.");
        return snake.getPosition().equals(food.getPosition());
    }
}
