public class Game {
    private int score;
    private static int highScore;
    private boolean gameOver;
    private GameState currentState;
    private Snake snake;
    private Food food;
    private Board board;
    private Timer timer;

    public Game() {
        this.score = 0;
        this.gameOver = false;
        this.currentState = GameState.NEW;
        this.board = new Board();
        this.snake = new Snake();
        this.food = new Food();
        this.timer = new Timer();
    }

    public void startNewGame() {
        System.out.println("Starting new game...");
        this.score = 0;
        this.snake = new Snake();
        this.food.spawnFood();
        this.board.setGamePosition(snake, food);
        showCountdown();
        this.currentState = GameState.RUNNING;
    }

    public void pauseGame() {
        System.out.println("Game paused.");
        this.currentState = GameState.PAUSE;
    }

    public void resumeGame() {
        System.out.println("Resuming game...");
        showCountdown();
        this.currentState = GameState.RUNNING;
    }

    public void exitGame() {
        System.out.println("Exiting game.");
        this.currentState = GameState.OVER;
    }

    public void updateScore(int points) {
        this.score += points;
        System.out.println("Score updated: " + this.score);
        if (this.score > highScore) {
            highScore = this.score;
            System.out.println("New High Score: " + highScore);
        }
    }

    private void showCountdown() {
        this.timer.startCountdown();
    }

}
