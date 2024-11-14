public class Board implements Drawable {
    private int width = 20;
    private int height = 20;

    public void initializeBoard() {
        System.out.println("Initializing board with width " + width + " and height " + height);
    }

    public void drawBoard() {
        System.out.println("Drawing board.");
    }

    public void resetBoard() {
        System.out.println("Board reset.");
    }

    public void setGamePosition(Snake snake, Food food) {
        System.out.println("Setting snake and food on board.");
    }

    @Override
    public void draw() {
        drawBoard();
    }
}

